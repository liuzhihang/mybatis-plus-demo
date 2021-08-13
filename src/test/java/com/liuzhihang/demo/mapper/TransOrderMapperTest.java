package com.liuzhihang.demo.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author liuzhihang
 * @date 2021/8/13 19:15
 */
@SpringBootTest
class TransOrderMapperTest {

    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private TransOrderMapper transOrderMapper;

    @Test
    void sumOrderAmount() {

        String userId = "1001";

        LocalDateTime startTime = LocalDateTime.parse("2021-08-15 00:00:00", DATE_TIME_FORMAT);
        LocalDateTime endTime = LocalDateTime.parse("2021-08-17 00:00:00", DATE_TIME_FORMAT);

        long sum = transOrderMapper.sumOrderAmount(userId);

        long sumWithTime = transOrderMapper.sumOrderAmount(userId, startTime, endTime);

        System.out.println("sum=" + sum + " sumWithTime=" + sumWithTime);

    }
}