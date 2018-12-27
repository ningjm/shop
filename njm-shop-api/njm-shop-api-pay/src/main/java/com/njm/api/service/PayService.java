package com.njm.api.service;

import com.njm.api.model.Pay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: shop
 * @description: 支付服务接口
 * @author: Mr.Ning
 * @create: 2018-12-25 15:45
 **/

@RestController
@RequestMapping("/pay")
public interface PayService {

    @RequestMapping("/pay_money")
    Map<String,Object> payMoney();

    //此接口用来测试雪崩效应
    @RequestMapping("/pay_money2")
    Map<String,Object> payMoney2();

    //此接口用来测试是否与pay_money2同一个线程池
    @RequestMapping("/pay_money3")
    Map<String,Object> payMoney3();
}
