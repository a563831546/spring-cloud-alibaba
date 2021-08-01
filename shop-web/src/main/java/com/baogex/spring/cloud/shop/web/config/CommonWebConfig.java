package com.baogex.spring.cloud.shop.web.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@Slf4j
@Configuration
@EntityScan("com.baogex.spring.cloud.shop.common")
public class CommonWebConfig {
    
    @PostConstruct
    public void init() {
        log.info("[sys][CommonWebConfig]init..."); 
    }
}
