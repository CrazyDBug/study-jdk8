package com.dragon.cache.distribute;

/**
 * @date: 2024/3/29 09:02
 * @author: ybl
 */
public interface DistributedCacheService {

    String getValue(Integer key);

    void setValue(Integer key, String value);
}
