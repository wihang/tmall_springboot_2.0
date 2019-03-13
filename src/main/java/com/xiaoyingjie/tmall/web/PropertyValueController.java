package com.xiaoyingjie.tmall.web;

/**
 * @author Xiao
 * @Title: PropertyValueController
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:05
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoyingjie.tmall.pojo.Product;
import com.xiaoyingjie.tmall.pojo.PropertyValue;
import com.xiaoyingjie.tmall.service.ProductService;
import com.xiaoyingjie.tmall.service.PropertyValueService;

@RestController
public class PropertyValueController {
    @Autowired PropertyValueService propertyValueService;
    @Autowired ProductService productService;

    @GetMapping("/products/{pid}/propertyValues")
    public List<PropertyValue> list(@PathVariable("pid") int pid) throws Exception {
        Product product = productService.get(pid);
        propertyValueService.init(product);
        List<PropertyValue> propertyValues = propertyValueService.list(product);
        return propertyValues;
    }

    @PutMapping("/propertyValues")
    public Object update(@RequestBody PropertyValue bean) throws Exception {
        propertyValueService.update(bean);
        return bean;
    }

}