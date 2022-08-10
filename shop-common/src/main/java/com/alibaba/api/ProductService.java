package com.alibaba.api;

import com.alibaba.entity.Product;

/**
 * @Author davis you
 * @Date 2022/8/10 4:55 PM
 * @Version 1.0
 */
public interface ProductService {
    Product findByPid(Integer pid);
}
