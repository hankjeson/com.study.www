package com.zjj.testIOCxml;

import com.zjj.entry.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class BeanFactory01 {
    @Before
    public void init(){
        System.out.println("----init-----");
    }
    @Test
    public void test01(){
        Resource resource = new FileSystemResource("F:\\Java\\bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Student student = beanFactory.getBean("stu01",Student.class);
        System.out.println(student);
    }
    @After
    public void destory(){
        System.out.println("-----destory------");
    }
}
