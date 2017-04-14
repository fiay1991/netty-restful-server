package com.fiay.bo;

import com.fiay.entity.TUser;
import net.mengkang.nettyrest.response.Info;

/**
 * BO OBJ
 * Created by Fiay on 2017/4/8.
 */
public class BoUser extends Info {

    private TUser user;

    public BoUser(TUser user) {
        this.user = user;
    }

    public TUser getUser() {
        return user;
    }

    public void setUser(TUser user) {
        this.user = user;
    }
}
