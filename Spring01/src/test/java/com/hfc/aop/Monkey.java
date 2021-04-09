package com.hfc.aop;

/*这个是一个一个业务类---他里边有集体的要执行的方法；*/
public class Monkey {
    public void stealPeaches(String name) {
        System.out.println("我是一只猴子，我的名字是：\t"+name+"\t我要去偷桃子！！！！！");
    }

    public void show() {
        System.out.println("我是一个猴子！！！！");
    }
}
