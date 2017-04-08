package com.fiay.service.impl;

import com.fiay.dao.IUserDao;
import com.fiay.entity.TUser;
import com.fiay.service.IUserService;

/**
 * 后台用户业务逻辑实现类
 * Created by Fiay on 2017/4/7.
 */

public class UserServiceImpl implements IUserService  {

    private IUserDao userDao;

    @Override
    public TUser get(Long id) {
        System.err.println("----------- 进入 userService.getId " + id);
        return userDao.get(id);
    }
}
