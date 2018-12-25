package com.njm.api.model;

/**
 * @program: shop
 * @description: 支付实体
 * @author: Mr.Ning
 * @create: 2018-12-25 15:43
 **/

public class Pay {
    private String token;
    private int payNum;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getPayNum() {
        return payNum;
    }

    public void setPayNum(int payNum) {
        this.payNum = payNum;
    }
}
