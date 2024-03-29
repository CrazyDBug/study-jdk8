package com.dragon.cache.service.impl;

import com.dragon.cache.distribute.DistributedCacheService;
import com.dragon.cache.local.LocalCacheService;
import com.dragon.cache.service.TestDataService;
import com.dragon.cache.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @date: 2024/3/29 13:24
 * @author: ybl
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    @Qualifier("redisCacheService")
    private DistributedCacheService distributedCacheService;

    @Autowired
    @Qualifier("guavaCacheService")
    private LocalCacheService localCacheService;

    @Autowired
    private TestDataService testDataService;

    @Override
    public String getValue(Integer key) {
        // 本地缓存
        String value = localCacheService.getValue(key);
        if (value == null) {
            // 分布式缓存
            value = distributedCacheService.getValue(key);
            if (value == null) {
                // 数据库
                value = testDataService.getValue(key);
                // 分布式缓存
                // 修改 空值支持缓存,防止穿透
                distributedCacheService.setValue(key, value);
            }
        }
        return value;
    }
}
