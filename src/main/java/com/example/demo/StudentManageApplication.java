package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepos;

@SpringBootApplication
public class StudentManageApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(StudentManageApplication.class, args);
	}
	
    @Autowired 
    private StudentRepos studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Student student1=new Student("Alex","Kannan","alex@gmail.com");
		studentRepository.save(student1);
		Student student2=new Student("siva","prasath","siva@gmail.com");
		studentRepository.save(student2);
	
		
		
	}

}
