package com.wmouren.service;

import org.springframework.beans.factory.SmartInitializingSingleton;

public class TestBean implements  SmartInitializingSingleton{

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("123");
    }
}
