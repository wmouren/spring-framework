package com.wmouren.service;	

import cn.TestApp;
import com.wmouren.TestAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author wmouren
 * @title: spring
 * @package com.wmouren.service
 * @date 2021/3/18
 * @describe
 */
//@Configuration
@Component
public class AppService {

//	@Autowired
	private A a;

	@PostConstruct
	public void t(){
		System.out.println("============"+a);
	}

}

