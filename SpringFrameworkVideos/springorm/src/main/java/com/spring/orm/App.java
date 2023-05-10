package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
      StudentDao studentDao = context1.getBean("studentDao",StudentDao.class);
      Student student = new Student(2324,"kiriti","Bhilai"); 
      int r = studentDao.insert(student);
      System.out.println("Success :"+r);
    }
}
