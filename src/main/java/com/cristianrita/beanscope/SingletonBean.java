package com.cristianrita.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.LocalTime;

@Component
@Scope("singleton")
public class SingletonBean {
    public SingletonBean() {
        System.out.println("SingletonBean created via constructor at " + LocalTime.now());
    }
}
