package com.toufupig.firstspringboot.controller;

import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/aaa")
    public String test01(@RequestParam(required = true) String aaa){
        String regix = "[0-9]*";
        boolean matches = Pattern.matches(regix, aaa);
        if (matches) {
            return "输入的字符串不能都是数字！";
        }
        return aaa;
    }

}