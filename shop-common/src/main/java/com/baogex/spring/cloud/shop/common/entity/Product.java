package com.baogex.spring.cloud.shop.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
@Data
@Entity(name = "shop_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private Long oid;

    private Integer uid;

    private String username;

}