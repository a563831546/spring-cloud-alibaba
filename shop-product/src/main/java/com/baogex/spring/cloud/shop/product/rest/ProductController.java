package com.baogex.spring.cloud.shop.product.rest;

import com.baogex.spring.cloud.shop.common.entity.Product;
import com.baogex.spring.cloud.shop.common.response.Response;
import com.baogex.spring.cloud.shop.common.verifier.RestResponseV;
import com.baogex.spring.cloud.shop.product.dao.ProductRepository;
import com.baogex.spring.cloud.shop.web.cons.WebConst;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: baogex
 * @Date: 2021/8/1
 */
@RestController
@RequestMapping(WebConst.BASE_PRE + "product")
public class ProductController {

    @Resource
    private ProductRepository repository;

    @GetMapping("/find/{pid}")
    public Response<Product> getProduct(@PathVariable("pid") Long pid) {
        return RestResponseV.returnIfPresent(repository.findById(pid).orElse(null));
    }

    @PostMapping("/save")
    public Response<Product> save(@RequestBody Product product) {
        return RestResponseV.returnIfPresent(repository.save(product));
    }
}
