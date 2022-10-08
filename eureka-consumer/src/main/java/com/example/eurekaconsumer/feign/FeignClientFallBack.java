package com.example.eurekaconsumer.feign;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eurekaconsumer.feign
 * @ClassName: FeignClientFallBack
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 14:01
 * @Version: 1.0
 */
@Component
public class FeignClientFallBack implements TestFeign{

    @Override
    public String testFeign(String name) {
        return "Fallback相当于是降级操作 服务降级处理是在客户端实现完成的！"+name;
    }
}
