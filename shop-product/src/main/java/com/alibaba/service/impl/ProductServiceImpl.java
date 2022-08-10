package com.alibaba.service.impl;

import com.alibaba.api.ProductService;
import com.alibaba.dao.ProductDao;
import com.alibaba.entity.Product;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author davis you
 * @Date 2022/8/10 3:38 PM
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer id) {
        return productDao.findById(id).get();
    }
}
