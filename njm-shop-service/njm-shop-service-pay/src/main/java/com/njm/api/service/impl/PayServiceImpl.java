package com.njm.api.service.impl;

import com.njm.api.model.Pay;
import com.njm.api.service.PayService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @program: shop
 * @description: 支付服务
 * @author: Mr.Ning
 * @create: 2018-12-25 15:48
 **/

@Service        //不要忘了@Service
public class PayServiceImpl implements PayService {
    @Override
    public List<Pay> payMoney() {
        List<Pay> ls = new ArrayList<>();
        Pay pay = new Pay();
        pay.setToken(UUID.randomUUID().toString());
        pay.setPayNum(100);
        Pay pay2 = new Pay();
        pay2.setToken(UUID.randomUUID().toString());
        pay2.setPayNum(101);
        ls.add(pay);
        ls.add(pay2);
        return ls;
    }
}
