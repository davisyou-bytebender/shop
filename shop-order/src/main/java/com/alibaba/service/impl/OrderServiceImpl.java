package com.alibaba.service.impl;

import com.alibaba.dao.OrderDao;
import com.alibaba.entity.Order;
import com.alibaba.service.OrderService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @Author davis you
 * @Date 2022/8/10 4:36 PM
 * @Version 1.0
 */
@Service
@org.springframework.stereotype.Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
