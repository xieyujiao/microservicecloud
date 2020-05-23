package com.atxyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * className:DeptConsumer80_App
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
