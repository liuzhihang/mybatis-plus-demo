package com.liuzhihang.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuzhihang.demo.entity.User;
import com.liuzhihang.demo.mapper.UserMapper;
import com.liuzhihang.demo.service.TransUserService;
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
public class TransUserServiceImpl extends ServiceImpl<UserMapper, User> implements TransUserService {


}
