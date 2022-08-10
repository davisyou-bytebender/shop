package com.alibaba.dao;

import com.alibaba.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author davis you
 * @Date 2022/8/10 4:34 PM
 * @Version 1.0
 */
public interface OrderDao extends JpaRepository<Order, Long> {

}
