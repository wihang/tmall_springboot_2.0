package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: ProductDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/1323:55
 */
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Category;
import com.xiaoyingjie.tmall.pojo.Product;

public interface ProductDAO extends JpaRepository<Product,Integer>{
    Page<Product> findByCategory(Category category, Pageable pageable);
}