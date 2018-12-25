package com.njm.api.service.impl;

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
    public Map<String,Object> payMoney() {
        List<Object> ls = new ArrayList<>();
        Pay pay = new Pay();
        pay.setToken(UUID.randomUUID().toString());
        pay.setPayNum(100);
        Pay pay2 = new Pay();
        pay2.setToken(UUID.randomUUID().toString());
        pay2.setPayNum(101);
        List<Member> members = memberFeign.getMember();
        ls.add(pay);
        ls.add(pay2);
        ls.add(members);
        Map<String,Object> map = new HashMap<>();
        map.put("ls",ls );
        return map;
    }
}
