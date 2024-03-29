package com.dragon.cache.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @date: 2024/3/29 12:31
 * @author: ybl
 */
@Data
@TableName(value = "test_data")
public class TestData {
    private Integer id;
    private String name;
}
