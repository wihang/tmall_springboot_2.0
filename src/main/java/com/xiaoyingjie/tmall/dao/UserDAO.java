package com.xiaoyingjie.tmall.dao;

/**
 * @author Xiao
 * @Title: UserDAO
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:13
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.xiaoyingjie.tmall.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{

}