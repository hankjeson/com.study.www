package com.zjj.test;

import com.zjj.entry.Services;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testService {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean04");
        System.out.println(applicationContext);
        Services services = applicationContext.getBean("service",Services.class);
        System.out.println(services.add(2,5));
    }
}
