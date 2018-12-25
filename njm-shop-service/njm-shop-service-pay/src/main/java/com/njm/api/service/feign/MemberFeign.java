package com.njm.api.service.feign;

import com.njm.api.model.Member;
import com.njm.api.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: shop
 * @description: 调用会员服务
 * @author: Mr.Ning
 * @create: 2018-12-25 16:03
 **/

/**
 * FeignClient默认开启了ribbon本地负载均衡功能
 */
@FeignClient(name = "shop-member")  //调用会员服务
@RestController
@RequestMapping("/member")
public interface MemberFeign extends MemberService {

    @Override
    @RequestMapping("/get_member")
    List<Member> getMember();
}
