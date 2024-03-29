package com.dragon.cache.controller;

import com.dragon.cache.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2024/3/29 12:24
 * @author: ybl
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test/{key}")
    public String test(@PathVariable Integer key) {
        String name = testService.getValue(key);
        return name;
    }
}
