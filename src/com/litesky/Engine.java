package com.litesky;

/**
 * Created by finefine.com on 2017/12/4.
 */
public class Engine {

    private int num;

    public Engine(int num) {
        this.num = num;
        System.out.println(num+"缸发动机");
    }

    public void work() {
        System.out.println("引擎启动了....");
    }
}
