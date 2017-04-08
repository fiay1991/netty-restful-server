package com.fiay.resource;

import com.fiay.bo.BoUser;
import com.fiay.entity.TUser;
import com.fiay.service.IUserService;
import net.mengkang.nettyrest.ApiProtocol;
import net.mengkang.nettyrest.BaseResource;
import net.mengkang.nettyrest.response.Info;
import net.mengkang.nettyrest.response.Result;

/**
 * 后台用户HTTP资源请求操作类
 * Created by Fiay on 2017/4/7.
 */
public class TUserResource extends BaseResource {
    public TUserResource(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    private IUserService userService;

    public Result get() {
        System.err.println("----------- 进入 tUserResource get() ");
        int uid;

        Object uidCheck = parameterIntCheck(apiProtocol, "uid");
        if (uidCheck instanceof Result) {
            return (Result) uidCheck;
        } else {
            uid = (int) uidCheck;
        }
        System.err.println("----------- tUserResource get() 传入参数值: " + uid);
        TUser user = userService.get((long)uid);
        BoUser userBO = new BoUser(user);
        return new Result<Info>(userBO);
    }

}
