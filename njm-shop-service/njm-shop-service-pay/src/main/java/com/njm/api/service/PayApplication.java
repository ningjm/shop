package com.njm.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: shop
 * @description: 支付
 * @author: Mr.Ning
 * @create: 2018-12-25 09:36
 **/

@SpringBootApplication
@EnableEurekaClient     //注册中心客户端
@EnableFeignClients     //调用其他服务
@EnableHystrix          //Hystrix断路器
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class,args);
    }
}
