package org.rhine;

import org.apache.dubbo.config.annotation.Reference;
import org.rhine.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@EnableAutoConfiguration
public class ConsumerApplication implements CommandLineRunner {


    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(demoService.hello());
    }
}
