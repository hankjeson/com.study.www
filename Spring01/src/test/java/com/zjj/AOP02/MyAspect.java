package com.zjj.AOP02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
//    定义切入点表达式
    @Pointcut("execution(* com.zjj.AOP02.UserDao.*(..))")
    public void myPointcut(){
    }
//    使用一个返回值void、
    @Before("myPointcut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("学号：2018220255   姓名：谢吉星  班级：软件二班");
        System.out.println("前置通知：模拟执行权限检查。。。。");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println(",被植入增强处理的目标方法为：" + joinPoint.getSignature().getName());
    }
    @After("myPointcut()")
    public void myAfter(JoinPoint joinPoint){
        System.out.println("后置通知：模拟记录日志。。。。");
        System.out.println("学号：2018220255   姓名：谢吉星  班级：软件二班");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println(",被植入增强处理的方法为：" + joinPoint.getSignature().getName());
        System.out.println("环绕通知结束。。。。。。");
    }

    @Around("myPointcut()")
    public void myAround(JoinPoint joinPoint){
        System.out.println("环绕通知：模拟记录日志。。。。");
        System.out.print("目标类是：" + joinPoint.getTarget());
        System.out.println(",被植入增强处理的方法为：" + joinPoint.getSignature().getName());

    }
    @AfterReturning("myPointcut()")
    public void myAfterReturning(JoinPoint jp) {
        System.out.println("返回后通知：模拟记录日志。。。。");
        String name = jp.getSignature().getName();
        System.out.println(name + "执行之后记录成功---------最终通知");
    }


    @AfterThrowing(pointcut = "myPointcut()")
    public  void excaption(JoinPoint jp){
        System.out.println("异常通知：模拟记录日志。。。。");
        String name=jp.getSignature().getName();
        System.out.println("执行---------"+name+"时发生异常");
    }

}
