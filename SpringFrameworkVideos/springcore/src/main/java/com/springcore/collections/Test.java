package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/collections-config.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		System.out.println(emp1);
	}

}
