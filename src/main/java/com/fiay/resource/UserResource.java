package com.fiay.resource;

import com.fiay.SpringContextUtil;
import com.fiay.bo.BoUser;
import com.fiay.entity.TUser;
import com.fiay.service.IUserService;
import net.mengkang.nettyrest.ApiProtocol;
import net.mengkang.nettyrest.BaseResource;
import net.mengkang.nettyrest.ErrorHandler;
import net.mengkang.nettyrest.StatusCode;
import net.mengkang.nettyrest.response.Result;
import org.springframework.stereotype.Controller;

/**
 * 后台用户HTTP资源请求操作类
 * Created by Fiay on 2017/4/7.
 */
@Controller
public class UserResource extends BaseResource {

    private IUserService userService = (IUserService) SpringContextUtil.getBean("userService");

    public UserResource(ApiProtocol apiProtocol) {
        super(apiProtocol);
    }

    public Result get() {
        System.out.println("----------- 进入 tUserResource get() ");
        int uid;

        Object uidCheck = parameterIntCheck(apiProtocol, "uid");
        if (uidCheck instanceof Result) {
            return (Result) uidCheck;
        } else {
            uid = (int) uidCheck;
        }
        System.out.println("----------- tUserResource get() 传入参数值: " + uid + " 此时userService = " + userService);
        TUser user = userService.get((long)uid);
        BoUser userBO = new BoUser(user);
        if(user==null) {
            return ErrorHandler.error(StatusCode.UNKNOWN_USER);
        }
        return new Result<>(userBO);
    }

}
