package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eurekaconsumer.controller
 * @ClassName: FeignController
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 13:12
 * @Version: 1.0
 */
@RestController
@RequestMapping("feign")
public class FeignController {

    @Autowired
    TestFeign testFeign;

    @RequestMapping("test")
    public String test(String name){
        return testFeign.testFeign(name);
    }

    @RequestMapping("hello")
    public String hello(String name){
        return "hello"+name;
    }

}
