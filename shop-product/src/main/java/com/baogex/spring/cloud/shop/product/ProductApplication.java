package com.baogex.spring.cloud.shop.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@SpringBootApplication
@Slf4j
public class ProductApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(ProductApplication.class, args);
            log.info("Application Start Success!");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
