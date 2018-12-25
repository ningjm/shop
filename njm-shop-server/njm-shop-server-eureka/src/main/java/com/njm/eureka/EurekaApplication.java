package com.njm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: shop
 * @description: 会员
 * @author: Mr.Ning
 * @create: 2018-12-25 09:35
 **/

@SpringBootApplication
@EnableEurekaServer     //注册中心服务端
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
