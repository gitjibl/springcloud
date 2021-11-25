package com.example.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eureka.controller
 * @ClassName: FeignController
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 11:09
 * @Version: 1.0
 */
@RestController
@RequestMapping("feign")
public class FeignController {
    @RequestMapping("test")
    public String test(String name){
        return "hello client 8764:"+name;
    }
}