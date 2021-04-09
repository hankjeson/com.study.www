package com.sp.sop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogsAdvice {
	
	/*
//  1.前置通知
//  @Before("")//代表目标对象中每一个方法执行都会启动前置通知；*/

    @Before("execution(void *User(..))") //加入切面约束
    public void before(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println("前置通知启动了------目标对象的名字："+name);
    }

    @After("execution(void *User(..))") //加入切面约束
    public void after(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println("后置------通知启动了------目标对象的名字："+name);
    }

    @Around("execution(void *User(..))")
    public  void around(ProceedingJoinPoint pjp){
        String name=pjp.getSignature().getName();
        System.out.println(name+"环绕执行前*********");
        try {
            pjp.proceed();//继续往后走
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(name+"环绕后执行**********************");
    }


    @AfterReturning("execution(void *User(..))")
    public void log(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "执行之后记录成功---------最终通知");
    }


    @AfterThrowing(pointcut = "execution(void *User(..))")
    public  void excaption(JoinPoint jp){
        String name=jp.getSignature().getName();
        System.out.println("执行---------"+name+"时发生异常");
    }


}
