package com.baogex.spring.cloud.shop.web.config;

import com.baogex.spring.cloud.shop.web.interceptor.CommonInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@Slf4j
@Configuration
@EntityScan("com.baogex.spring.cloud.shop.common")
@ComponentScan("com.baogex.spring.cloud.shop.web.interceptor")
public class CommonWebConfig implements WebMvcConfigurer {

    @PostConstruct
    public void init() {
        log.info("[sys][CommonWebConfig]init...");
    }

    @Autowired
    private CommonInterceptor commonWebConfig;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonWebConfig)
                .addPathPatterns("/**");
    }

}
