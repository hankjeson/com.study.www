package com.zjj.testAOP;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAOP01 {
    @Before
    public void init(){
        System.out.println("----init----");
    }
    @Test
    public void testAop01() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        System.out.println(applicationContext);
        ServiceTarget serviceTarget = applicationContext.getBean("proxyFactoryBean" ,ServiceTarget.class);
        serviceTarget.sayHello();
        serviceTarget.sayHello2();
    }

    @Test
    public void testAop02() throws Exception {
        System.out.println("你好");
    }
    @After
    public void destory(){
        System.out.println("----destory----");
    }

}
