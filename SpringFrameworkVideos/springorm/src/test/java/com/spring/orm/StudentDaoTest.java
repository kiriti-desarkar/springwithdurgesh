package com.spring.orm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config.xml"})
public class StudentDaoTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testAddStudent() {
        Student student = new Student();
        student.setStudentId(123);
        student.setStudentName("John");
        student.setStudentCity("Paris");
        studentDao.setHibernateTemplate(null);
        // perform assertions to check if the student was added successfully
    }
}
