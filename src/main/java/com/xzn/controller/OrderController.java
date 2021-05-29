package com.xzn.controller;

import com.xzn.pojo.PageResult;
import com.xzn.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/{status}/{pageNo}/{pageSize}")
    public ResponseEntity<PageResult> queryOrderList(@PathVariable("status")Integer status,
                                                     @PathVariable("pageNo")Integer pageNo,
                                                     @PathVariable(value = "pageSize", required = false)Integer pageSize) {
        Long userId = 63l;

        return ResponseEntity.ok(orderService.queryOrderList(userId,status, pageNo, pageSize));
    }

}
