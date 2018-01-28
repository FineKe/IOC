package com.litesky;

/**
 * Created by finefine.com on 2017/12/4.
 */
public class Provider {


    public static Engine providerEngine() {
        return new Engine(4);
    }
}
