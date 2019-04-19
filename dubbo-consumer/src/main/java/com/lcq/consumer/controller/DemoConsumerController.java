package com.lcq.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lcq.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoConsumerController
 * 消费者控制层
 * @author lcq
 * @date 2019/4/19
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }

}
