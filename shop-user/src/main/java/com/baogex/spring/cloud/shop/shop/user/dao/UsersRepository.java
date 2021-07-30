package com.baogex.spring.cloud.shop.shop.user.dao;

import com.baogex.spring.cloud.shop.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
public interface UsersRepository extends JpaRepository<User, Integer> {
}
