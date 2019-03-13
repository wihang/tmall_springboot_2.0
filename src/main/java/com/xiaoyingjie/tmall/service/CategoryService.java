package com.xiaoyingjie.tmall.service;

/**
 * @author Xiao
 * @Title: CategoryService
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/1323:17
 */

import java.util.List;

import com.xiaoyingjie.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.xiaoyingjie.tmall.dao.CategoryDAO;
import com.xiaoyingjie.tmall.pojo.Category;

@Service
public class CategoryService {
    @Autowired CategoryDAO categoryDAO;

    public Page4Navigator<Category> list(int start, int size, int navigatePages) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(start, size,sort);
        Page pageFromJPA =categoryDAO.findAll(pageable);

        return new Page4Navigator<>(pageFromJPA,navigatePages);
    }
    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }
    public void add(Category bean) {
        categoryDAO.save(bean);
    }
    public void delete(int id) {
        categoryDAO.delete(id);
    }
    public Category get(int id) {
        Category c= categoryDAO.findOne(id);
        return c;
    }
    public void update(Category bean) {
        categoryDAO.save(bean);
    }
}