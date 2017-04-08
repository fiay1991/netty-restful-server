package net.mengkang.demo;

import net.mengkang.nettyrest.netty.NettyRestServer;

/**
 * Created by zhoumengkang on 7/1/16.
 */
public class ServerLauncher {



    public void run(String[] args) {
        NettyRestServer nettyRestServer = new NettyRestServer();
        nettyRestServer.start();
    }
}
