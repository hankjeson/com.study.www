package com.zjj.testIOCxml;
import com.zjj.entry.Dbutils;
import com.zjj.entry.Student;
import com.zjj.entry.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Before
    public void init(){
        System.out.println("----init-----");
    }
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = applicationContext.getBean("stu",Student.class);
        System.out.println(student.getSname()+"\t"+student.getSid()+"\t"+student.getSAddress());
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Teacher teacher = applicationContext.getBean("teacher01" ,Teacher.class);
        System.out.println(teacher);
    }

    @Test
    public void test04(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Teacher teacher = applicationContext.getBean("teacher01" ,Teacher.class);
        System.out.println(teacher.getTname()+"\t"+teacher.getStudent().getSname());
    }

    @Test
    public void test05(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Teacher teacher = applicationContext.getBean("teacher02" ,Teacher.class);
        System.out.println(teacher.getTname()+"\t"+teacher.getStudent().getSname());
    }

    @Test
    public void test06(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Dbutils dbutils = applicationContext.getBean("dbutils01" , Dbutils.class);
        System.out.println(dbutils);
        System.out.println(applicationContext.getBean("dbutils01" , Dbutils.class));
    }
    @After
    public void destory(){
        System.out.println("-----destory------");
    }
}
