package com.sp.sop;

import org.springframework.stereotype.Component;

/*这个是主流业务的实现类*/
@Component("userService")
public class UserServiceImpl implements UserService {

	public void insertUser() {

		System.out.println(10/0);
		// TODO Auto-generated method stub
		System.out.println("用户添加方法执行-------");
	}

	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
		System.out.println("用户更新方法执行-------");
	}

	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("10/0");
		System.out.println("用户删除方法执行-------");
	}

	public void find() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
		System.out.println("用户查找方法执行-------");
	}

}
