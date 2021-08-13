package com.liuzhihang.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuzhihang.demo.entity.TransOrder;

/**
 * 订单 Service
 *
 * @author liuzhihang
 * @date 2020/10/20 17:47
 */
public interface OrderService extends IService<TransOrder> {

    /**
     * 获取订单
     * @param orderNo
     * @return
     */
    TransOrder getByOrderNo(String orderNo);
}
