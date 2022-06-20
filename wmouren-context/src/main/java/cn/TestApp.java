package cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestApp {

    @Bean
    public A a(){
        return new A();
    }
}
