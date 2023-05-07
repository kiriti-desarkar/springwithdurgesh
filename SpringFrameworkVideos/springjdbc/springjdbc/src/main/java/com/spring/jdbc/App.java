package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started ............" );
        //spring jdbc -> jdbcTemplate
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext(
        				"com/spring/jdbc/config.xml");
		/*
		 * JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * //insert query String query =
		 * "insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //fire query int records = template.update(query,456,"Piuka Gupta","Digboi");
		 * System.out.println("Number of records inserted: "+records);
		 */
        StudentDao student = context.getBean("studentDao",StudentDao.class);
        Student s1 = new Student();
        s1.setId(43);
        s1.setName("Tarun Desarkar");
        s1.setCity("Bhilai");
        int result = student.insert(s1);
        System.out.println("Number of student added: "+result);
    }
}
