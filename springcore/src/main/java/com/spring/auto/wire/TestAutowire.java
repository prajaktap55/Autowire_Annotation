package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) 
	{
	ApplicationContext ctx2=new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
	Emp emp1=ctx2.getBean("Employee",Emp.class);//no need type casting/container gives Emp class object
	System.out.println(emp1);
	}

}
