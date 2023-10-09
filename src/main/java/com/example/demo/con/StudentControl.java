package com.example.demo.con;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;



@Controller
public class StudentControl {
	@Autowired
	public StudentService studentService;

	public StudentControl(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public ModelAndView booklist() {
		List<Student> list=studentService.getAllStud();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("students");
		mv.addObject("book",list);
		return new ModelAndView("students","book",list);
	}
}
