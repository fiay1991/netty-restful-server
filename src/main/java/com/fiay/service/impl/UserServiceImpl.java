package com.fiay.service.impl;

import com.fiay.service.IUserService;
import net.mengkang.demo.service.BaseService;
import net.mengkang.nettyrest.ApiProtocol;

/**
 * 后台用户业务逻辑实现类
 * Created by Fiay on 2017/4/7.
 */
public class UserServiceImpl extends BaseService implements IUserService  {

    public UserServiceImpl(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }



}
