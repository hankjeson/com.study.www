package com.zjj.testAOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice  implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("这个是我们的前置通知-----"+method.getName()+"这个方法触发的！！！！！");
	}

}
