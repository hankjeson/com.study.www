package com.zjj.JDBC;

import com.zjj.JDBC.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("JDBC.xml");
		Service serviceImpl=applicationContext.getBean("serviceImpl", Service.class);
//		serviceImpl.addStu();
//
//		serviceImpl.selectStu();
		
		serviceImpl.delStu();
//		serviceImpl.upStu();
		
	}

}
