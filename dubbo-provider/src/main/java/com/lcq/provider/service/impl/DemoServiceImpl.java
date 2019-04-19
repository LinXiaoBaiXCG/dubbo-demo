package com.lcq.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lcq.api.service.DemoService;

/**
 * DemoServiceImpl
 * 服务提供类
 * @author lcq
 * @date 2019/4/19
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
