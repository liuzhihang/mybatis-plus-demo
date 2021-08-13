package com.liuzhihang.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liuzhihang.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户 Mapper
 *
 * @author liuzhihang
 * @date 2020/10/20 17:47
 */
public interface UserMapper extends BaseMapper<User> {


}
