package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;


public interface StudentRepos extends JpaRepository<Student,Long> {
	

}
