package com.hfc.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*这个是一个我们的切面类； 只要你的猴子跑到院子中来偷桃子；就会触发事件*/

@Aspect   //只要你在类上写这个注解； 这个类是一个切面类
public class Guardian {

    //	这个就是切入点； 当你的猴子调用它的偷 桃子的方法的时候；就会触发这个事件
    @Pointcut("execution(* com.hfc.aop.Monkey.stealPeaches(..))")
    public void foundMonkey() {}  //这个就是一个方法

    //	这个就是我们的前置通知
    @Before(value = "foundMonkey()")  // 给我们的抓猴子的方法进行一个前置通知；
    public void foundBefore() {
        System.out.println("悄悄的，猴子已经来了，我们就可以去抓他 。。。。。");
    }
    // 这个就是后置通知
    @AfterReturning(value = "foundMonkey()&& args(name,..)")
    public void foundAfter(String name ) {
        System.out.println("小猴子已经被抓住 了，他的名字叫："+name);
    }
}
