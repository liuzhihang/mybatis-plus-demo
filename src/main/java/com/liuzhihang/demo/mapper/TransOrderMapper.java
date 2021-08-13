package com.liuzhihang.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuzhihang.demo.entity.TransOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

/**
 * 订单 Mapper
 *
 * @author liuzhihang
 * @date 2020/10/20 17:47
 */
public interface TransOrderMapper extends BaseMapper<TransOrder> {


    @Select("select ifnull(sum(order_amount),0) from trans_order where user_id = #{userId} ;")
    long sumOrderAmount(@Param("userId") String userId);

    @Select("select ifnull(sum(order_amount),0) from trans_order where user_id = #{userId} and create_time between #{startTime} and #{endTime};")
    long sumOrderAmount(@Param("userId") String userId,@Param("startTime") LocalDateTime startTime,@Param("endTime") LocalDateTime endTime);

}
