package com.litesky.chapter1.model;

import com.litesky.chapter1.USBDevice;

public class KingSton implements USBDevice {
    @Override
    public void use() {
        System.out.println("KingSton 设备已插入，可安全使用");
    }
}
