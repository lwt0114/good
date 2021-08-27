package com.mvc.rule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

public class SelfRule extends RandomRule {
    int index=0;
    int total=0;
    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;
            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }
                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }
                //通过索引选择服务器
//                int index = this.chooseRandomInt(serverCount);
//                server = (Server)upList.get(index);
                //重写后的策略 规则开始
                System.out.println(upList.size());
                if(total<5){//如果还不够五次
                    server = (Server)upList.get(index);
                    total++;
                }else{
                    total=0;
                    index++;
                    if(index>=upList.size()){
                        index=0;
                    }
                }
                //重写后的策略规则结束
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }
                    server = null;
                    Thread.yield();
                }
            }
            return server;
        }
    }
}

