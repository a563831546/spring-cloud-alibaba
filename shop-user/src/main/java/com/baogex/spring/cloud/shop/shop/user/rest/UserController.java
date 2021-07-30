package com.baogex.spring.cloud.shop.shop.user.rest;

import com.alibaba.fastjson.JSON;
import com.baogex.spring.cloud.shop.common.entity.User;
import com.baogex.spring.cloud.shop.common.response.Response;
import com.baogex.spring.cloud.shop.common.response.RestResponse;
import com.baogex.spring.cloud.shop.common.verifier.RestResponseV;
import com.baogex.spring.cloud.shop.shop.user.dao.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author : zuomin.yu
 * @date : 2021-07-19
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UsersRepository usersRepository;

    @GetMapping("/find/{id}")
    public Response<User> findUser(@PathVariable("id") Integer userId) {
        log.info("[i2][userService][findUser]--入参:{}", JSON.toJSONString(userId));
        return RestResponseV.returnIfPresent(usersRepository.findById(userId).get());
    }

    @PostMapping("/save")
    public Response<User> save(@RequestBody User user) {
        log.info("[i2][userService][save]--入参:{}", JSON.toJSONString(user));
        usersRepository.save(user);
        return RestResponse.buildSuccess(user);
    }

}
