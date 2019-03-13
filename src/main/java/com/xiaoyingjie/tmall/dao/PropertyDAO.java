package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: PropertyDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/1323:48
 */
import java.util.List;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Category;
import com.xiaoyingjie.tmall.pojo.Property;

public interface PropertyDAO extends JpaRepository<Property,Integer>{
    Page<Property> findByCategory(Category category, Pageable pageable);
    List<Property> findByCategory(Category category);

}