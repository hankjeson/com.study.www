package com.zjj.testAOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdivce implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("我是一个环绕通知----在你的主流业务执行前执行了！！！！！");
		invocation.proceed();  // 执行你的主流业务
		System.out.println("我还是一个环绕通知----是在你的主流业务执行之后执行！！！");
		return null;
	}

}
