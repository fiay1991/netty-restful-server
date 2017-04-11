package com.fiay.service.impl;

import com.fiay.SpringContextUtil;
import com.fiay.dao.IUserDao;
import com.fiay.entity.TUser;
import com.fiay.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 后台用户业务逻辑实现类
 * Created by Fiay on 2017/4/7.
 */
@Service("userService")
public class UserServiceImpl implements IUserService  {

    private IUserDao userDao = (IUserDao) SpringContextUtil.getBean("IUserDao");

    @Override
    public TUser get(Long id) {
        System.out.println("----------- 进入 userService.getId " + id);
        return userDao.getById(id);
    }
}
