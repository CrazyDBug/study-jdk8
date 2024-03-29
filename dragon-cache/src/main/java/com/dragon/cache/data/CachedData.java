package com.dragon.cache.data;
/**
 * @date: 2024/3/29 09:23
 * @author: ybl
 */
public class CachedData {
    private String data;
    private int version;

    public CachedData(String data, int version) {
        this.data = data;
        this.version = version;
    }

    public String getData() {
        return data;
    }

    public int getVersion() {
        return version;
    }

    // 更新版本号
    public void incrementVersion() {
        version++;
    }
}
