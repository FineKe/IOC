package com.litesky;

/**
 * Created by finefine.com on 2017/12/4.
 */
public class Car {

    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public void start() {
        if (engine == null) {
            System.out.println("没有引擎，汽车无法启动");
        } else {
            engine.work();
            System.out.println("发车了");
        }
    }
}
