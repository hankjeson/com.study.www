package com.hfc.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanhfc.xml");
        System.out.println(applicationContext);
        Monkey monkey = applicationContext.getBean("monkey",Monkey.class);
        monkey.stealPeaches("张三");
        monkey.show();
    }
}
