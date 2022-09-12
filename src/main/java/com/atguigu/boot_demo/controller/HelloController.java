package com.atguigu.boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 老贼
 * @version : 1.0
 * @Project : jucjvm
 * @Package : com.atguigu.boot_demo.controller
 * @ClassName : HelloController.java
 * @createTime : 2022/9/9 15:23
 * @Email :851185679@qq.com
 * @Description :
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/helloboot",method = RequestMethod.GET)
    @GetMapping
    public String hello(){
        return "hello,springBoot";
    }
}
