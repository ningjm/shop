package com.njm.api.service.impl;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.njm.api.model.Member;
import com.njm.api.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: shop
 * @description: 会员服务
 * @author: Mr.Ning
 * @create: 2018-12-25 15:22
 **/

@Service    //不要忘了@Service
public class MemberServiceImpl implements MemberService {

    @Value("${server.port}")
    private String prot;

    @Override
    public List<Member> getMember() {
        System.out.println("我是二狗，我已进入皇宫");
        //睡眠6秒。用来测试feign客户端调用时间，已在pay服务的配置文件配置feign为5秒
        //6>5则连接不到。
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Member> ls = new ArrayList<>();
        Member member = new Member();
        member.setName("二狗");
        member.setAge(2);
        Member member2 = new Member();
        member2.setName("端口号为："+ prot);
        member2.setAge(3);
        ls.add(member);
        ls.add(member2);
        System.out.println("我是二狗，我已取到资源。");
        System.out.println(Thread.currentThread().getName());
        return ls;
    }
}
