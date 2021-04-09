package com.zjj.testAOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
	
		System.out.println("这个是后置通知---其实就在你的业务完之后执行----"+method.getName());
		
	}
	

}
