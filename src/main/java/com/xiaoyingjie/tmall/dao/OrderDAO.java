package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: OrderDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:16
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Order;
import com.xiaoyingjie.tmall.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
}