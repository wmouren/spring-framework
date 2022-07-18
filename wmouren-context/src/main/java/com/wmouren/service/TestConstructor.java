package com.wmouren.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestConstructor {

    @Autowired(required = false)
    public TestConstructor(){}



    @Autowired(required = false)
    public TestConstructor(I i1, I i2) {

    }

    @Autowired(required = false)
    public TestConstructor(I i1) {

    }

    @Autowired(required = false)
    private TestConstructor(I i1,I i2,B b){}

}
