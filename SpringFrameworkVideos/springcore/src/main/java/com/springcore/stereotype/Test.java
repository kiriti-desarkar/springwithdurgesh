package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.ref.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereo-config.xml");
		Student temp = context.getBean("student",Student.class);
		System.out.println(temp.hashCode());
		Student temp2 = context.getBean("student",Student.class);
		System.out.println(temp2.hashCode());
		
		Teacher temp3 = context.getBean("teacher",Teacher.class);
		System.out.println(temp3.hashCode());
		Teacher temp4 = context.getBean("teacher",Teacher.class);
		System.out.println(temp4.hashCode());
	}

}
