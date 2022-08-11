package com.coolcoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coolcoder.model.Student;
import com.coolcoder.repository.StudentRepository;

@SpringBootTest
class DemoTestingApplicationTests {

	@Autowired
	private StudentRepository repo;
	
	@Test	
	public void saveStudent() {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setFirstName("xyx");
		s1.setLastName("ABC");
		s1.setGender("F");;;
		s1.setAge(24);
		repo.save(s1);
	}
}
