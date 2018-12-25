package com.njm.api.service.impl;

import com.njm.api.model.Member;
import com.njm.api.service.MemberService;
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

    @Override
    public List<Member> getMember() {
        List<Member> ls = new ArrayList<>();
        Member member = new Member();
        member.setName("二狗");
        member.setAge(2);
        Member member2 = new Member();
        member2.setName("大狗");
        member2.setAge(3);
        ls.add(member);
        ls.add(member2);
        return ls;
    }
}
