package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: ProductImageDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/1323:58
 */
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.Product;
import com.xiaoyingjie.tmall.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);

}