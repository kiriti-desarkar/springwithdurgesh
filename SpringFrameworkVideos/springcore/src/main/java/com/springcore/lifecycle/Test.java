package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//CommonAnnotationBeanPostProcessor
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycle-config.xml");
		context.registerShutdownHook();
		Samosa temp = (Samosa) context.getBean("s1");
		System.out.println(temp);
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		Jalebi j1 = (Jalebi) context.getBean("j1");
		System.out.println(j1);
		
	}

}
