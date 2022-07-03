package com.wmouren;

import com.wmouren.service.A;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

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
//@EnableAspectJAutoProxy
///@Import(A.class)
public  class App {

	public static void main(String[] args) throws IOException {
		final AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(App.class);
		final A bean = context.getBean(A.class);
//		System.out.println(bean.getI());
		bean.getI();

	}

}
