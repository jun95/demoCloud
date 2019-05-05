package com.democloud.discovery.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * springcloud注册中心
 * Created by hwj on 2019/4/30.
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCloudEurekaApplication.class,args);
    }
}
