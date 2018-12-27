package com.njm.api.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.njm.api.model.Member;
import com.njm.api.model.Pay;
import com.njm.api.service.PayService;
import com.njm.api.service.feign.MemberFeign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @program: shop
 * @description: 支付服务
 * @author: Mr.Ning
 * @create: 2018-12-25 15:48
 **/

@Service        //不要忘了@Service
public class PayServiceImpl implements PayService {

    @Resource
    MemberFeign memberFeign;    //调用会员服务

    @Override
    //默认使用线程隔离方式（对cpu性能比较高）
    @HystrixCommand(fallbackMethod = "error")
    public Map<String,Object> payMoney() {
        List<Object> ls = new ArrayList<>();
        Pay pay = new Pay();
        pay.setToken(UUID.randomUUID().toString());
        pay.setPayNum(100);
        Pay pay2 = new Pay();
        pay2.setToken(UUID.randomUUID().toString());
        pay2.setPayNum(101);
        System.out.println("二狗，进皇宫！");
        List<Member> members = memberFeign.getMember();
        ls.add(pay);
        ls.add(pay2);
        ls.add(members);
        Map<String,Object> map = new HashMap<>();
        map.put("ls",ls );
        System.out.println("二狗已完成任务！");
        System.out.println("payMoney:"+ Thread.currentThread().getName());
        return map;
    }

    //返回参数要和主方法相同,可以声明和主方法相同的参数进行使用
    public Map<String,Object> error(Throwable throwable) {
        System.out.println("服务降级!");
        Map<String,Object> map  = new HashMap<>();
        map.put("key", "服务降级!");
        System.out.println(throwable.getMessage());
        return map;
    }

    //此接口用来测试雪崩效应
    @Override
    public Map<String, Object> payMoney2() {
        List<Object> ls = new ArrayList<>();
        List<Member> members = memberFeign.getMember();
        ls.add(members);
        Map<String,Object> map = new HashMap<>();
        map.put("ls",ls );
        System.out.println("payMoney2:"+ Thread.currentThread().getName());
        return map;
    }


    //此接口用来测试是否与payMoney2的线程池相同
    @Override
    public Map<String, Object> payMoney3() {
        List<Object> ls = new ArrayList<>();
        List<Member> members = memberFeign.getMember();
        ls.add(members);
        Map<String,Object> map = new HashMap<>();
        map.put("ls",ls );
        System.out.println("payMoney3:"+ Thread.currentThread().getName());
        return map;
    }
}
