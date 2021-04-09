package com.zjj.testAOP;


//这个是我们的一个接口---就是定义你的主流的业务
//(主流的业务；他相当 存钱；取钱； 转账；吃饭；等等)

public interface ServiceTarget {
	
	void sayHello() throws Exception;
	void sayHello2() throws Exception;

}
