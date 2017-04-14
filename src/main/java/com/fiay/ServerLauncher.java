package com.fiay;

import net.mengkang.nettyrest.netty.NettyRestServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fiay on 8/4/17.
 */

public class ServerLauncher {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationContext.xml");
        NettyRestServer nettyRestServer = new NettyRestServer();
        nettyRestServer.start();
    }
}
