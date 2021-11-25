package com.example.eurekaconsumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: springcloud
 * @Package: com.example.eurekaconsumer.config
 * @ClassName: feignConf
 * @Author: jibl
 * @Description:
 * @Date: 2021/11/23 11:45
 * @Version: 1.0
 */
@Configuration
public class feignConf {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

