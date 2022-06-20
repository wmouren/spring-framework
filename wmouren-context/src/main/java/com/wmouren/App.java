package com.wmouren;

import com.wmouren.service.A;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @author wmouren
 * @title: spring
 * @package com.wmouren
 * @date 2021/3/17
 * @describe
 */
@Configuration
@ComponentScan
public  class App {

	public static void main(String[] args) throws IOException {
//		final AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(App.class);


		System.out.println(!BeanUtils.isSimpleProperty(A.class));
	}

}
