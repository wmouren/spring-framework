package com.wmouren.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.TestResolvableDependency;
import org.springframework.stereotype.Component;

@Component
public class A {


    @Autowired
    public void testB(TestResolvableDependency resolvableDependency){
        resolvableDependency.test();
    }

}
