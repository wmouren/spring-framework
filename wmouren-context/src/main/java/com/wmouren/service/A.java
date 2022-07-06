package com.wmouren.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.TestResolvableDependency;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


public class A  {

    /**
     * @Autowired
     * 首先根据类型查找 查找出来是一个map key：beanName value：bean
     * 如果只找到一个则直接赋值 filed。set
     * 如果找到多个再从多个，map 长度大于 1 ，则使用属性名称（也就是 beanName ）在这个 map 中查找
     */
    @Autowired
    I i1;
    @Autowired
    I i2;


    public I getI(){
        System.out.println(i1);
        System.out.println(i2);
        return i1;
    }



}
