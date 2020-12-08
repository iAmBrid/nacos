package com.qianziw.service;

import com.qianziw.feignService.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "qianziw/order")
public class OrderService {
    @Autowired
    private MemberFeignService memberFeignService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "order_to_member")
    public String order(@RequestParam Integer userid){
        return "order server : " + serverPort + memberFeignService.getUser(userid);
    }
}
