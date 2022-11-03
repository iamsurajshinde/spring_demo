package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping
	public String getEmployees() {
		return "Employee GET API new changes";
	}

	@PostMapping
	public String addEmployees() {
		return "Employee POST API working";
	}
}
