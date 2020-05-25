package com.atxyj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * className:Config_3344_StartSpringCloudApp
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
