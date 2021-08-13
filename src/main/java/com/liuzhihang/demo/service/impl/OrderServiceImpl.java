package com.liuzhihang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhihang.demo.entity.TransOrder;
import com.liuzhihang.demo.mapper.TransOrderMapper;
import com.liuzhihang.demo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户
 *
 * @author liuzhihang
 * @date 2020/10/20 17:48
 */
@Slf4j
@Service
public class OrderServiceImpl extends ServiceImpl<TransOrderMapper, TransOrder> implements OrderService {


    @Override
    public TransOrder getByOrderNo(String orderNo) {

        return getOne(new LambdaQueryWrapper<TransOrder>().eq(TransOrder::getOrderNo, orderNo));
    }
}
