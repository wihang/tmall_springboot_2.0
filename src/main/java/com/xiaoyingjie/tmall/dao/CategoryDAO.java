package com.xiaoyingjie.tmall.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.xiaoyingjie.tmall.pojo.Category;
 
public interface CategoryDAO extends JpaRepository<Category,Integer>{
 
}