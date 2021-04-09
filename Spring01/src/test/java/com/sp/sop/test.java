package com.sp.sop;

import com.zjj.AOP02.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test02() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sopbean.xml");
        System.out.println(applicationContext);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.deleteUser();
    }
}
