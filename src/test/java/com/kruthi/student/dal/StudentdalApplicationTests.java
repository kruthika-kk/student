package com.kruthi.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kruthi.student.dal.entities.Student;
import com.kruthi.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentdalApplicationTests {
	@Autowired

	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Keshav");
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
	public void tesUpdatetudent() {
	
		 Student student = studentRepository.findById(1l).get();
		 student.setFee(40d);
		 studentRepository.save(student);
	}
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1l);
		
	}
}
