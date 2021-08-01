package com.baogex.spring.cloud.shop.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@Slf4j
@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(OrderApplication.class);
            log.info("[S][start] start success!");
        } catch (Throwable t) {
            log.info("[E][start] start happen fail,", t);
        }
    }
}
