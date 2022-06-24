package com.wmouren;

import cn.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
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
@Import(A.class)
public  class App {

	public static void main(String[] args) throws IOException {
		final AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(App.class);

	}

}
