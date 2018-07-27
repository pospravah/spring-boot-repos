package com.udemy.edu;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.udemy.edu.entities.Student;
import com.udemy.edu.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(student);	
	}
	
	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudentById() {
		Student student = studentRepository.findById(1l).get();
		student.setFee(45d);
		studentRepository.save(student);
		student = studentRepository.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	public void testDeleteStudentById() {
		studentRepository.deleteById(1l);
		}


}
