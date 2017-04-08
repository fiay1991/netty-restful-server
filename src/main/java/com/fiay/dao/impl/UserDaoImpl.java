package com.fiay.dao.impl;

import com.fiay.dao.IUserDao;
import com.fiay.entity.TUser;

/**
 * Created by Fiay on 2017/4/7.
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public TUser get(Long id) {
        System.err.println("----------- 进入 userDao.getId " + id);
        //test
        TUser user01 = new TUser((long)1,"fiay__ID__1","fiay__ID__1");
        TUser user02 = new TUser((long)2,"fiay__ID__2","fiay__ID__2");
        return user01.getId()==id?user01:(user02.getId()==id?user02:null);
    }
}
