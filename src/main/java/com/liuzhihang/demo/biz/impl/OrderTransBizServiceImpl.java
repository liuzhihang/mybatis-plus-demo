package com.liuzhihang.demo.biz.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.liuzhihang.demo.biz.OrderTransBizService;
import com.liuzhihang.demo.entity.TransOrder;
import com.liuzhihang.demo.entity.User;
import com.liuzhihang.demo.enums.OrderStatusEnum;
import com.liuzhihang.demo.service.OrderService;
import com.liuzhihang.demo.service.TransUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuzhihang
 * @date 2020/11/6 17:48
 */
@Slf4j
@Service
public class OrderTransBizServiceImpl implements OrderTransBizService {

    @Autowired
    private TransUserService transUserService;

    @Autowired
    private OrderService orderService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateOrderStatusAndUserBalance() throws Exception {

        LambdaUpdateWrapper<User> userWrapper = new LambdaUpdateWrapper<>();

        userWrapper.set(User::getBalance, 500)
                .eq(User::getId, 1)
                .eq(User::getBalance, 400);

        boolean userUpdate = transUserService.update(userWrapper);

        if (!userUpdate) {
            log.error("用户更新失败 id:{}", 1);
            throw new Exception("用户更新失败");
        }

        LambdaUpdateWrapper<TransOrder> orderWrapper = new LambdaUpdateWrapper<>();

        orderWrapper.set(TransOrder::getOrderStatus, OrderStatusEnum.SUCCESS)
                .eq(TransOrder::getId, 1)
                .eq(TransOrder::getOrderStatus, OrderStatusEnum.INIT);

        boolean orderUpdate = orderService.update(orderWrapper);

        if (!orderUpdate) {
            log.error("订单更新失败 id:{}", 1);
            throw new Exception("订单更新失败");
        }
    }
}
