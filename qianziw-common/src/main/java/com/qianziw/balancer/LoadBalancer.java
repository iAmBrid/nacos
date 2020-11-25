package com.qianziw.balancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 负载均衡接口
 */
public interface LoadBalancer {

    ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances);
}
