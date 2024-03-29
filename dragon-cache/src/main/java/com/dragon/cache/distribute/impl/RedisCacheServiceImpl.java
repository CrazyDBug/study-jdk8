package com.dragon.cache.distribute.impl;

import com.dragon.cache.distribute.DistributedCacheService;
import com.dragon.cache.local.LocalCacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    @Qualifier("guavaCacheService")
    private LocalCacheService localCacheService;

    @Override
    public String getValue(Integer key) {
        String value = (String) redisTemplate.opsForValue().get(String.valueOf(key));
        log.info("redis获取缓存值{}",value);
        if (value != null) {
            localCacheService.setValue(key, value);
        }
        return value;
    }

    @Override
    public void setValue(String key, String value) {
        log.info("redis——缓存设置值");
        redisTemplate.opsForValue().set(key, value, 10, TimeUnit.SECONDS);
    }
}
