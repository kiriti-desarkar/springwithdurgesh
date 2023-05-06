package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collections/standalone/collections-config.xml");
		Person emp1 = (Person) context.getBean("p1");
		System.out.println(emp1);

	}

}
