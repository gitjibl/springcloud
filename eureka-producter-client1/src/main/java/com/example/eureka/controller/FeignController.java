package com.example.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eureka.controller
 * @ClassName: FeignController
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 11:06
 * @Version: 1.0
 */
@RestController
@RequestMapping("feign")
public class FeignController {
    @RequestMapping("test")
    public String test(String name){
        System.out.println("===================");
        return "hello client 8763:"+name;
    }
}
