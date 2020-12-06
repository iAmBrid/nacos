package com.qianziw.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "qianziw-member")
public interface MemberFeignService {

    @PostMapping(value = "/qianziw/member/user/")
    String getUser(@RequestParam Integer userid);
}
