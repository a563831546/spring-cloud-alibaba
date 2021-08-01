package com.baogex.spring.cloud.shop.common.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
@Entity(name = "t_order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long oid;
    
    private Integer uid;
    private String username;
    
    private Integer pid;
    private Integer number;
    private String pName;
    private BigDecimal pPrice;
}
