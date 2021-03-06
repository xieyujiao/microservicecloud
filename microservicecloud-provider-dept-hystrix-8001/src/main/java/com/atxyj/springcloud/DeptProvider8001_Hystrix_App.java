package com.atxyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


/**
 * className:DeptProvider8001_App
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册到euraka服务中
@EnableDiscoveryClient //用于开启服务发现
@EnableCircuitBreaker //对Hystrix对熔断器进行支持
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
