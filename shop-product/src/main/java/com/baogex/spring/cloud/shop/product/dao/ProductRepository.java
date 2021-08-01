package com.baogex.spring.cloud.shop.product.dao;

import com.baogex.spring.cloud.shop.common.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: baogex
 * @Date: 2021/8/1
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
