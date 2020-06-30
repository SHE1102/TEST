package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SYX on 2020/6/30.
 */
@RestController
public class Test {

    @RequestMapping("/test")
    public String test(){
        return "sfsdfdsfafgaf";
    }
}
