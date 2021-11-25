package com.example.eurekaconsumer.feign;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eurekaconsumer.feign
 * @ClassName: TestFeign
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 11:01
 * @Version: 1.0
 */
@Component
@FeignClient(value = "EUREKA-PRODUCTER",fallback = FeignClientFallBack.class)
public interface TestFeign {
    @RequestMapping("/feign/test")
    String testFeign(@RequestParam("name") String name);
}


