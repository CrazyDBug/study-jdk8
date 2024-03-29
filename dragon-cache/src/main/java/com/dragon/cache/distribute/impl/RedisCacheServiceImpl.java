package com.dragon.cache.distribute.impl;

import com.dragon.cache.distribute.DistributedCacheService;
import com.dragon.cache.local.LocalCacheService;
import com.dragon.cache.service.TestDataService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Description;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @date: 2024/3/29 09:49
 * @author: ybl
 */
@Slf4j
@Service(value = "redisCacheService")
public class RedisCacheServiceImpl implements DistributedCacheService {

    final String REDIS_KEY = "redis:";

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private TestDataService testDataService;

    @Autowired
    private RedissonClient redissonClient;

    @Autowired
    @Qualifier("guavaCacheService")
    private LocalCacheService localCacheService;

    @Description("1.0版本--废弃")
    public String getValue1(Integer key) {
        String value = (String) redisTemplate.opsForValue().get(String.valueOf(key));
        log.info("redis获取缓存值{}", value);
        if (value != null) {
            localCacheService.setValue(key, value);
        }
        return value;
    }

    @Override
    public String getValue(Integer key) {
        String value = (String) redisTemplate.opsForValue().get(String.valueOf(key));
        log.info("redis获取缓存值{}", value);
        if (value != null) {
            localCacheService.setValue(key, value);
        } else {
            // 可重入锁
            RLock lock = redissonClient.getLock(REDIS_KEY + key);
            try {
                lock.tryLock(10, TimeUnit.SECONDS);
                value = testDataService.getValue(key);
                setValue(key, value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        return value;
    }

    @Override
    public void setValue(Integer key, String value) {

        log.info("redis——缓存设置值{}", value);
        // 新增空值处理
        if (value == null) {
            redisTemplate.opsForValue().set(String.valueOf(key), value, 2, TimeUnit.SECONDS);
        } else {
            redisTemplate.opsForValue().set(String.valueOf(key), value, 10, TimeUnit.SECONDS);
        }
    }
}
