package com.xiaoyingjie.tmall.service;

/**
 * @author Xiao
 * @Title: UserService
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:13
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.xiaoyingjie.tmall.dao.UserDAO;
import com.xiaoyingjie.tmall.pojo.User;
import com.xiaoyingjie.tmall.util.Page4Navigator;

@Service
public class UserService {

    @Autowired UserDAO userDAO;

    public Page4Navigator<User> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA =userDAO.findAll(pageable);
        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }

}