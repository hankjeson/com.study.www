package com.zjj.AOP02;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoimpl implements UserDao{
    @Override
    public void addUser() throws Exception {
        System.out.println("添加用户");
    }

    @Override
    public void Exception() throws Exception {
        System.out.println("我是一个异常"+"10/0"+10/0);
    }

    @Override
    public void delectUser() throws Exception {
        System.out.println("删除用户");
    }
}
