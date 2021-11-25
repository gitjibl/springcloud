package com.example.zuulserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud
 * @Package: com.example.zuulserver.controller
 * @ClassName: TestController
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/25 10:03
 * @Version: 1.0
 */
@RestController
public class TestController {
    @RequestMapping("producter")
    public String producter(String name){
        return "1";
    }
}
