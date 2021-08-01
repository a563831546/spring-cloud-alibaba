package com.baogex.spring.cloud.shop.order.rest;

import com.baogex.spring.cloud.shop.common.entity.Order;
import com.baogex.spring.cloud.shop.common.entity.Product;
import com.baogex.spring.cloud.shop.common.entity.User;
import com.baogex.spring.cloud.shop.common.response.Response;
import com.baogex.spring.cloud.shop.common.response.RestResponse;
import com.baogex.spring.cloud.shop.common.verifier.RestResponseV;
import com.baogex.spring.cloud.shop.order.dao.OrderRepository;
import com.baogex.spring.cloud.shop.web.cons.WebConst;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: baogex
 * @Date: 2021/7/31
 */
@RestController
@RequestMapping(WebConst.BASE_PRE + "order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private OrderRepository orderRepository;

    @PostMapping("save")
    public Response<Order> saveOrder(Order order) {
        Order result = orderRepository.save(order);
        return RestResponseV.returnIfPresent(result);
    }

    @GetMapping("/order/{pid}")
    public Response<Product> order(@PathVariable("pid") Integer pid) {
        Product product = restTemplate.getForObject(
                "localhost:9210/api/v1/product/find/" + pid, Product.class);
        return RestResponseV.returnIfPresent(product);
    }

}
