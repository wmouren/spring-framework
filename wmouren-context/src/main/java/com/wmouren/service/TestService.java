package com.wmouren.service;

import cn.TestApp;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

//@Component
@Aspect
//@Component
public class TestService  {

    @Pointcut("execution(public * *(..))")
    public void p(){}

    @Before(value = "p()")
    public void bef(){
        System.out.println("123123");
    }


}
