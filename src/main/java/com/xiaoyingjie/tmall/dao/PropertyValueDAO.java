package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: PropertyValueDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:04
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Product;
import com.xiaoyingjie.tmall.pojo.Property;
import com.xiaoyingjie.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);

}