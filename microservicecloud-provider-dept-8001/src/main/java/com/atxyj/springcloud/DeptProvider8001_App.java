package com.atxyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



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
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class, args);
    }
}
