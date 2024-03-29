package com.dragon.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dragon.cache.mapper")
@SpringBootApplication
public class DragonCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(DragonCacheApplication.class, args);
    }

}
