package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepos;
import com.example.demo.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	public StudentRepos studentRepository;
	
	public StudentServiceImpl(StudentRepos studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStud(){
		
		      return studentRepository.findAll();
	}

}
