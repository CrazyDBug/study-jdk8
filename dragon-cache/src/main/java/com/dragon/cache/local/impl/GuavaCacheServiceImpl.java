package com.dragon.cache.local.impl;


import com.dragon.cache.local.LocalCacheService;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @date: 2024/3/29 09:03
 * @author: ybl
 */
@Slf4j
@Service(value = "guavaCacheService")
public class GuavaCacheServiceImpl implements LocalCacheService {

    @Value("${local.cache.enable}")
    private boolean enable;

//    private Cache<String, CachedData> cache = CacheBuilder.newBuilder()
//            .maximumSize(15)
//            .expireAfterWrite(5, TimeUnit.SECONDS)
//            .build();


    private Cache<Integer, String> cache = CacheBuilder.newBuilder()
            .maximumSize(15)
            .expireAfterWrite(5, TimeUnit.SECONDS)
            .build();


//    @Override
//    public String get(String key, int expectedVersion) {
//
//        CachedData cachedData = cache.getIfPresent(key);
//        if (cachedData != null && cachedData.getVersion() == expectedVersion) {
//            return cachedData.getData();
//        } else {
//            // 缓存中的数据版本号与期望版本号不一致，重新加载数据
//            // 这里可以添加重新加载数据的逻辑
//            // 从远程缓存获取数据
//            // 远程缓存为开启——读数据库缓存
//            return null;
//        }
//    }
//    @Override
//    public void set(String key, String value) {
//
//    }

//    @Override
//    public String get(Integer key) {
//        CachedData cachedData = cache.getIfPresent(key);
//        if (cachedData != null) {
//            return cachedData.getData();
//        } else {
//            // 缓存中的数据版本号与期望版本号不一致，重新加载数据
//            // 这里可以添加重新加载数据的逻辑
//            // 从远程缓存获取数据
//            // 远程缓存为开启——读数据库缓存
//            return null;
//        }
//    }

    @Override
    public String getValue(Integer key) {
        String value = cache.getIfPresent(key);
        log.info("guava——获取值{}",value);
        return value;
//        CachedData cachedData = cache.getIfPresent(key);
//        if (cachedData != null) {
//            return cachedData.getData();
//        } else {
//            // 缓存中的数据版本号与期望版本号不一致，重新加载数据
//            // 这里可以添加重新加载数据的逻辑
//            // 从远程缓存获取数据
//            // 远程缓存为开启——读数据库缓存
//            return null;
//        }
    }

    @Override
    public void setValue(Integer key, String value) {
        log.info("guava设置值");
        cache.put(key, value);
    }


}
