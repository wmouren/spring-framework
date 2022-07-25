package com.wmouren.service;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements SmartFactoryBean<TestBean>, SmartInitializingSingleton {
    @Override
    public TestBean getObject() throws Exception {
        return new TestBean();
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }


    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("afterSingletonsInstantiated...");
    }

    @Override
    public boolean isEagerInit() {
        return true;
    }
}
