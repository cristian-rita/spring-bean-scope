package com.cristianrita.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        for (int i = 0; i < 10; i++) {
            context.getBean("singletonBean");
            context.getBean("prototypeBean");
        }
    }
}
