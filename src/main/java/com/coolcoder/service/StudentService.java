package com.coolcoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolcoder.model.Student;
import com.coolcoder.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	
	public Student saveStudentDetails(Student student) {
		return studentRepository.save(student);
	}
}
