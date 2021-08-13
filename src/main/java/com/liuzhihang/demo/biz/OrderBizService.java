package com.liuzhihang.demo.biz;

/**
 * @author liuzhihang
 * @date 2020/11/6 11:19
 */
public interface OrderBizService {


    void callBack() throws Exception;

    void updateOrderStatusAndUserBalance() throws Exception;


}
