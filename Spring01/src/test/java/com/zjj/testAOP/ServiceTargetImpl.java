package com.zjj.testAOP;
// 这个是你的接口的实现；

import lombok.Data;
/*这个是我们主流业务的实现类*/
@Data
public class ServiceTargetImpl implements ServiceTarget {

	private String name;

	int a;
	int b;

	public void sayHello() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("这是我们的主流的业务----（存钱； 取钱-等等）"+getName());
		System.out.println(a*b*b*b);
		int c=10/0;

	}

	public void sayHello2() throws Exception {
		// TODO Auto-generated method stub

	}

}

