package com.xiaoyingjie.tmall.web;

/**
 * @author Xiao
 * @Title: OrderController
 * @ProjectName tmall_springboot
 * @Description: TODO
 * @date 2019/3/140:20
 */
import com.xiaoyingjie.tmall.pojo.Order;
import com.xiaoyingjie.tmall.service.OrderItemService;
import com.xiaoyingjie.tmall.service.OrderService;
import com.xiaoyingjie.tmall.util.Page4Navigator;
import com.xiaoyingjie.tmall.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;

@RestController
public class OrderController {
    @Autowired OrderService orderService;
    @Autowired OrderItemService orderItemService;

    @GetMapping("/orders")
    public Page4Navigator<Order> list(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<Order> page =orderService.list(start, size, 5);
        orderItemService.fill(page.getContent());
        orderService.removeOrderFromOrderItem(page.getContent());
        return page;
    }
    @PutMapping("deliveryOrder/{oid}")
    public Object deliveryOrder(@PathVariable int oid) throws IOException {
        Order o = orderService.get(oid);
        o.setDeliveryDate(new Date());
        o.setStatus(OrderService.waitConfirm);
        orderService.update(o);
        return Result.success();
    }
}