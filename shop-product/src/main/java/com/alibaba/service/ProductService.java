package com.alibaba.service;

import com.alibaba.entity.Product;

/**
 * @Author davis you
 * @Date 2022/8/10 3:37 PM
 * @Version 1.0
 */
public interface ProductService {
    public Product findByPid(Integer id);
}
