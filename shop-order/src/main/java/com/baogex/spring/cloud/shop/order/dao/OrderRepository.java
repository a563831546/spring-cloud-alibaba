package com.baogex.spring.cloud.shop.order.dao;

import com.baogex.spring.cloud.shop.common.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
