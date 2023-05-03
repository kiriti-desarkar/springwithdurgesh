package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/ci/ci-config.xml");
		Person temp1 = (Person) context.getBean("Person");
		System.out.println(temp1);
		Addition a = (Addition) context.getBean("Add");
		a.doSum();
	}

}
