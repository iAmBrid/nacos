package com.qianziw.sevice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员服务
 */
@RestController
@RequestMapping("/qianziw/member")
public class MemberService {

    @Value("${server.port}")
    private String serverPort;
    /**
     * 会员服务提供的接口被订单服务调用
     * @param
     * @return
     */
    @PostMapping("/user")
    public String getUser(@RequestParam Integer userid){
        return "千字文会员 user : " + userid + ",端口号:" + serverPort;
    }
}
