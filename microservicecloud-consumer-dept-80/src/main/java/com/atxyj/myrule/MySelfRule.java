package com.atxyj.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * className:MySelfRule
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */

@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        return new RandomRule_XYJ();
        //自定义每台机器5次
    }
}


