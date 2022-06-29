package com.wmouren.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.TestResolvableDependency;
import org.springframework.stereotype.Component;

//@Configuration
public class A  {

    @EventListener
    public void evm(ApplicationEvent applicationEvent){

    }


}
