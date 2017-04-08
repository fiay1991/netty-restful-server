package com.fiay.service;

import com.fiay.entity.TUser;

/**
 * 后台用户业务逻辑接口
 * Created by Fiay on 2017/4/7.
 */
public interface IUserService {
    public TUser get(Long id);
}
