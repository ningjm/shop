package com.njm.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @program: shop
 * @description: 会员
 * @author: Mr.Ning
 * @create: 2018-12-25 09:35
 **/

@SpringBootApplication
@EnableEurekaClient     //注册中心客户端
@EnableHystrix          //Hystrix断路器
public class MemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
    }
}
