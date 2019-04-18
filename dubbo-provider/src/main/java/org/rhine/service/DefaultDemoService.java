package org.rhine.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author qs.zhou
 * @date 2019/04/17
 */
@Service(version = "1.0.0")
public class DefaultDemoService implements DemoService{

    @Override
    public String hello() {
        return "hello world";
    }

}
