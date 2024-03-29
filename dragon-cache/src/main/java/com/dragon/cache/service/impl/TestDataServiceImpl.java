package com.dragon.cache.service.impl;

import com.dragon.cache.mapper.TestDataMapper;
import com.dragon.cache.service.TestDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @date: 2024/3/29 13:30
 * @author: ybl
 */
@Slf4j
@Service
public class TestDataServiceImpl implements TestDataService {

    @Autowired
    private TestDataMapper testDataMapper;

    @Override
    public String getValue(Integer key) {
        String value = testDataMapper.selectById(key).getName();
        log.info("数据库获取缓存值{}",value);
        return value;
    }
}
