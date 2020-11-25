package com.qianziw.balancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 轮询算法
 */
@Component
public class RotationLoadBalancer implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance getSingleAddres(List<ServiceInstance> serviceInstances) {
        int index = atomicInteger.incrementAndGet() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
