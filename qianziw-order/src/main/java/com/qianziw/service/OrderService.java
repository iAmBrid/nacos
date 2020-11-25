package com.qianziw.service;

import com.qianziw.balancer.LoadBalancer;
import com.qianziw.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/qianziw/order")
public class OrderService {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order_to_member")
    public String orderToMember(){
        try{
            String memberGetUserURL = "http://" + PropertiesUtil.getProperty("qianziw.member") + "/" + PropertiesUtil.getProperty("member.getUser");
            String memberResult = restTemplate.getForObject(memberGetUserURL+ "?userid=5", String.class);
            return "订单调用会员结果为：" + memberResult;
        }catch (Exception e){
            e.printStackTrace();
            return "查询失败";
        }
    }
}
