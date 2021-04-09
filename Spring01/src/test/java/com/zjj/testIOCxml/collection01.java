package com.zjj.testIOCxml;

import com.zjj.entry.airplane;
import com.zjj.entry.airplanes;
import com.zjj.entry.login;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class collection01 {
    @Before
    public void init(){
        System.out.println("----init----");
    }
    @Test
    public void test01(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        login login = applicationContext.getBean("login01",login.class);
        System.out.println(login.toString());
    }
    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        airplanes airplanes1 = applicationContext.getBean("airplanes1", airplanes.class);
        System.out.println(airplanes1.toString());
    }
    @Test
    public void testList(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        airplanes airplanes1 = applicationContext.getBean("airplanes1", airplanes.class);
        for (Object list:
             airplanes1.getList()) {
            System.out.println(list.toString());
        }
    }

    @Test
    public void testMap(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        airplane airplane01 = applicationContext.getBean("airplane01", airplane.class);
        for (String key:
                airplane01.getMaps().keySet() ) {
            System.out.println("key :"+key);
        }
        for (String values:
                airplane01.getMaps().values()) {
            System.out.println("values :"+values);
        }
        for (Map.Entry<String,String> entry:
                airplane01.getMaps().entrySet()) {
            System.out.println("key :"+entry.getKey()+"\t"+"values :"+entry.getValue());
        }
    }

    @Test
    public void testSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        airplane airplane02 = applicationContext.getBean("airplane02", airplane.class);
        for (String string : airplane02.getSet()
             ) {
            System.out.println(string);
        }
        
    }
    @After
    public void destory(){
        System.out.println("----destory----");
    }
}
