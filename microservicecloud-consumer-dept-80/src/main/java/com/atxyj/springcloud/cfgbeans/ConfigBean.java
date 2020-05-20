package com.atxyj.springcloud.cfgbeans;

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
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
