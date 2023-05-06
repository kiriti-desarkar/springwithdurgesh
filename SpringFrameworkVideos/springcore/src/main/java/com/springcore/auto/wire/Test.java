package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.ref.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/auto-config.xml");
		Employee temp = (Employee) context.getBean("emp");
		System.out.println(temp);
	}

}
