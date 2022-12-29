package com.practice.resttemplatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.resttemplatedemo.domain.Employee;
import com.practice.resttemplatedemo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@GetMapping("/employee/all")
	public List<Employee> retrieveAllEmployee(){
		
		
		return service.retrieveAllEmployee();
	}
}
