package com.alibaba.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author davis you
 * @Date 2022/8/10 3:50 PM
 * @Version 1.0
 */
@Configuration
public class IClientConfig {
    @Bean
    public DefaultClientConfigImpl iClientConfig(){
        return new DefaultClientConfigImpl();
    }
}
