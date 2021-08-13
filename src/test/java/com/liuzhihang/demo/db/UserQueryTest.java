package com.liuzhihang.demo.db;

import com.liuzhihang.demo.MybatisPlusDemoApplicationTests;
import com.liuzhihang.demo.biz.OrderBizService;
import com.liuzhihang.demo.service.OrderService;
import com.liuzhihang.demo.service.TransUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.MessageFormat;

/**
 * @author liuzhihang
 * @date 2020/10/20 17:49
 */
@Slf4j
public class UserQueryTest extends MybatisPlusDemoApplicationTests {

    @Autowired
    private TransUserService transUserService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderBizService orderBizService;

    @Test
    public void transactionTest() {

        try {

            orderBizService.callBack();
        } catch (Exception e) {
            log.error("发生异常", e);
        }

    }

}
