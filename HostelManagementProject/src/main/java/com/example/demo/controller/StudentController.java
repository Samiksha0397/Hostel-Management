package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		List<String> students = List.of("Samiksha", "Aarav", "Priya", "Rohan");
	    model.addAttribute("students", studentRepository.findAll());
	    return "students"; // matches students.html
	}

}
