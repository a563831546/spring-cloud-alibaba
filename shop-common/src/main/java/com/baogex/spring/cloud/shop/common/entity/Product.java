package com.baogex.spring.cloud.shop.common.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
@Data
@Entity(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;

    private String pName;

    private BigDecimal pPrice;

    private Integer pStock;

}
