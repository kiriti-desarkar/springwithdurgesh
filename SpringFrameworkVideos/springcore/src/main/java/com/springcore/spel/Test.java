package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/spel/spel-config.xml");
		Demo d = context.getBean("demo",Demo.class);
		System.out.println(d);
		
		SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
		Expression parseExpression = spelExpressionParser.parseExpression("1+3+5");
		System.out.println(parseExpression.getValue());
	}

}
