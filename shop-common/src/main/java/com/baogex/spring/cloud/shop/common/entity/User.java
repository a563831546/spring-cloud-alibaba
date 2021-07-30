package com.baogex.spring.cloud.shop.common.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
@Entity(name = "shop_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Integer uid;
    
    private String username;
    
    private String password;
    
    private String telephone;
}
