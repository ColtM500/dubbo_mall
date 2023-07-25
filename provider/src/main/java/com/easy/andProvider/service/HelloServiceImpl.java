package com.easy.andProvider.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.easy.and.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;


@DubboService
public class HelloServiceImpl implements HelloService {
    
    @Override
    @SentinelResource(value = "sayHello")
    public String hello(String name) {
        return "你好 " + name;
    }
}