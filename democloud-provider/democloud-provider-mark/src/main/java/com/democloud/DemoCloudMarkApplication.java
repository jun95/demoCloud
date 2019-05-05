package com.democloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by hwj on 2019/4/30.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@EnableCaching
@EnableHystrix
@EnableHystrixDashboard
@EnableFeignClients
public class DemoCloudMarkApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCloudMarkApplication.class,args);
    }
}
