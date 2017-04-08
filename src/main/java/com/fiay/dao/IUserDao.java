package com.fiay.dao;

import com.fiay.entity.TUser;

/**
 * 后台用户数据请求接口
 * Created by Fiay on 2017/4/7.
 */
public interface IUserDao {
    public TUser get(Long id);
}
