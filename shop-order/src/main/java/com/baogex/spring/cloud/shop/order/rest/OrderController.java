package com.baogex.spring.cloud.shop.order.rest;

import com.baogex.spring.cloud.shop.common.entity.Order;
import com.baogex.spring.cloud.shop.common.entity.User;
import com.baogex.spring.cloud.shop.common.response.Response;
import com.baogex.spring.cloud.shop.common.response.RestResponse;
import com.baogex.spring.cloud.shop.common.verifier.RestResponseV;
import com.baogex.spring.cloud.shop.order.dao.OrderRepository;
import com.baogex.spring.cloud.shop.web.cons.WebConst;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@RestController
@RequestMapping(WebConst.BASE_PRE + "order")
public class OrderController {

    @Resource
    private OrderRepository orderRepository;

    @PostMapping("save")
    public Response<Order> saveOrder(Order order) {
        Order result = orderRepository.save(order);
        return RestResponseV.returnIfPresent(result);
    }
}
