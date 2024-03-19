package com.dragon.pattern.singleton;

/**
 * @date: 2024/3/19 13:07
 * @author: ybl
 */
public class Singleton {
    // 使用volatile关键字确保instance在多线程环境下的可见性
    private static volatile Singleton instance;

    // 私有化构造方法，防止外部直接实例化对象
    private Singleton() {
    }

    // 提供获取单例实例的静态方法
    public static Singleton getInstance() {
        // 第一次检查，如果instance为空，则进入同步块
        if (instance == null) {
            // 使用synchronized关键字对同步块进行加锁
            synchronized (Singleton.class) {
                // 第二次检查，防止多个线程同时通过第一次检查，导致多次创建实例
                if (instance == null) {
                    // 创建单例实例
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

