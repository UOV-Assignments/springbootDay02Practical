package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PrintDetails {
	@GetMapping("/details")
	public String printStudent() {
		return "Name: Lasanga"+"\nAge: 24"+"\nCourse: ICT";
	}
	
}
