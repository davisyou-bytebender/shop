package com.alibaba.controller;

import com.alibaba.api.ProductService;
import com.alibaba.entity.Order;
import com.alibaba.entity.Product;
import com.alibaba.fastjson.JSON;
import com.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author davis you
 * @Date 2022/8/10 4:18 PM
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Reference
    private ProductService productService;

    @Autowired
    private RestTemplate restTemplate;

    // 准备买一件商品
    @GetMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        log.info(">>客户下单，这时候要调用商品微服务查询商品信息");
        //通过restTemplate调用商品微服务
//        Product product = restTemplate.getForObject( "http://localhost:8081/product/" + pid, Product.class);
        Product product = productService.findByPid(pid);
        log.info(">>商品信息,查询结果:" + JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());

        order.setPname(product.getPname());
        order.setPprice(product.getPprice()); order.setNumber(1);
        orderService.save(order);
        return order;
    }
}
