package com.zjj.AOP02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAOP {
//    @Test
//    public void test01(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop01.xml");
//        System.out.println(applicationContext);
//        MyTarget mytarget = applicationContext.getBean("myTarget",MyTarget.class);
//        mytarget.show();
//    }
    @Test
    public void test02() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sopbean.xml");
        System.out.println(applicationContext);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.addUser();
    }
// 测试方法3
    @Test
    public void test03() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop01.xml");
        System.out.println(applicationContext);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.addUser();
    }
// 测试方法4
    @Test
    public void test04() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop01.xml");
        System.out.println(applicationContext);
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.Exception();
    }
}
