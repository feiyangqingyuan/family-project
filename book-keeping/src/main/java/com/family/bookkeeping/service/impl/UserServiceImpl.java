package com.family.bookkeeping.service.impl;

import com.family.bookkeeping.entity.User;
import com.family.bookkeeping.mapper.UserMapper;
import com.family.bookkeeping.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author feiyang
 * @since 2021-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
