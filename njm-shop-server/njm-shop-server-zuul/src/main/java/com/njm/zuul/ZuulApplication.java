package com.njm.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: shop
 * @description: 网关
 * @author: Mr.Ning
 * @create: 2018-12-25 09:33
 **/

@SpringBootApplication
@EnableZuulProxy        //开启网关
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
