package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
        //insert query
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int change(Student student) {
        //update query
        String query = "update student set name=? , city=? where id=?";
        int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int delete(int studentId) {
        //delete query
        String query = "delete from student where id=?";
        int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}

	public Student getStudent(int studentId) {
        //select student
        String query = "select * from student where id=?";
        RowMapperImpl rowMapper = new RowMapperImpl();
        Student st1 = this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return st1;
	}

	public List<Student> getAllStudents() {
        String query = "select * from student";
        RowMapperImpl rowMapper = new RowMapperImpl();
        List<Student> students = this.jdbcTemplate.query(query,rowMapper);
		return students;
	}

	
}
