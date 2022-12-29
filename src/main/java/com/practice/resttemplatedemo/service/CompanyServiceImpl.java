package com.practice.resttemplatedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.practice.resttemplatedemo.domain.Employee;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${demo.resttemplate.employee.host.url}")
	private String employeeHostUrl;

	@Value("${demo.resttemplate.employee.all-employee-uri}")
	private String allEmployeeUri;

	@Override
	public List<Employee> retrieveAllEmployee() {

		String apiUrl = employeeHostUrl + allEmployeeUri;
		
		//Method - 1: Using Array as response type with restTemplate.getForObject
//		Employee[] empInfo = restTemplate.getForObject(apiUrl,Employee[].class );
//		
//		return Arrays.asList(empInfo);

		//Method - 2: Using ParameterizedTypeReference for generic types with restTemplate.exchange
		ResponseEntity<List<Employee>> response = restTemplate
				.exchange(apiUrl, 
						HttpMethod.GET,
						null, 
						new ParameterizedTypeReference<List<Employee>>() {
				});
		return response.getBody();
	}

}
