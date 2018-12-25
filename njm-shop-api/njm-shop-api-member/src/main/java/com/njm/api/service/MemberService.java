package com.njm.api.service;

import com.njm.api.model.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: shop
 * @description: 会员服务
 * @author: Mr.Ning
 * @create: 2018-12-25 15:17
 **/

@RestController
@RequestMapping("/member")
public interface MemberService {

    @RequestMapping("/get_member")
    List<Member> getMember();
}
