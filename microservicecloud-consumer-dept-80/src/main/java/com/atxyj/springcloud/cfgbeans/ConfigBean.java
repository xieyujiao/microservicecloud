package com.atxyj.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * className:ConfigBean
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //ribbon是一个客户端的负载均衡的工具 所以客户端要开启
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    //自定义负载均衡的随机算法
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//达到的目的,用重新选择的随机算法替代轮询算法
    }

}
