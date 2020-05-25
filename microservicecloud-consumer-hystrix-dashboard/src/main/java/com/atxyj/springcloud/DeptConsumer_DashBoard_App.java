package com.atxyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * className:DeptConsumer_DashBoard_App
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}

