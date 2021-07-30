package com.baogex.spring.cloud.shop.shop.user;

import com.baogex.spring.cloud.shop.common.entity.User;
import com.baogex.spring.cloud.shop.shop.user.dao.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class UserApplicationTest {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void test() {
        User user = new User();
        user.setUid(2);
        user.setUsername("打黑");
        user.setPassword("www");
        user.setTelephone("2123");
        usersRepository.save(user);
    }
}