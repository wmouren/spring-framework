package com.wmouren;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface TestAnnotation {

    String name() default "wmouren";
}
