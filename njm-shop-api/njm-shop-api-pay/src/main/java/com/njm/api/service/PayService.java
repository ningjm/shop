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
}
