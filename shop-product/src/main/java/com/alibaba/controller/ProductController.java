package com.alibaba.controller;

import com.alibaba.entity.Product;
import com.alibaba.fastjson.JSON;
import com.alibaba.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author davis you
 * @Date 2022/8/10 3:40 PM
 * @Version 1.0
 */
@RestController
@Slf4j
public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/product/{pid}")
//    public Product product(@PathVariable("pid") Integer pid){
//        Product product = productService.findByPid(pid);
//        log.info("查询到商品：" + JSON.toJSONString(product));
//        return product;
//    }
}
