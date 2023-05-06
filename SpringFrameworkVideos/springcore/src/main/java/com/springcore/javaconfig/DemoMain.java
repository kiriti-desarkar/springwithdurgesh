package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.javaconfig.JavaConfig;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student",Student.class);
		student.study();
	}

}
