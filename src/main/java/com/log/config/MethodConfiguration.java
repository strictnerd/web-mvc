package com.log.config;

import com.log.aop.MethodAspect;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @LogMethod aspect配置
 * @author Chenwl
 * @version 1.0.0
 * @date 2017/7/17
 */
@Slf4j
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class MethodConfiguration {

    @Bean
    public MethodAspect logMethodAspect(){
        return new MethodAspect();
    }
}
