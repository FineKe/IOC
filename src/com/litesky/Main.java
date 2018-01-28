package com.litesky;

public class Main {

    public static void main(String[] args) {
        Car car=new Car();
        car.setEngine(Provider.providerEngine());
        car.start();
    }
}
