package com.alibaba.dao;

import com.alibaba.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author davis you
 * @Date 2022/8/10 3:36 PM
 * @Version 1.0
 */
public interface ProductDao extends JpaRepository<Product, Integer> {
}
