package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/spring/jdbc/config.xml");
		 */
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
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
        //Student s1 = new Student();
        //s1.setId(43);
        //s1.setName("Ankit Tiwari");
        //s1.setCity("Delhi");
        //int result = student.insert(s1);
        //int result = student.change(s1);
        //int result = student.delete(456);
        //Student s2 = student.getStudent(43);
        List<Student> students = student.getAllStudents();
        for(Student s:students)
        System.out.println(s);
    }
}
