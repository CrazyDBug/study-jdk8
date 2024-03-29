package com.dragon.cache.local;

/**
 * @author 赌狗
 */
public interface LocalCacheService {

//    public String get(String key, int expectedVersion);
//
//    public void set(String key, String value);
//
//    String get(Integer key);

    String getValue(Integer key);

    void setValue(Integer key, String value);
}
