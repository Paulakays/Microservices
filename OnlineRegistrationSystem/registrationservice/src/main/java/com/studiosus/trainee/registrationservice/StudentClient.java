package com.studiosus.trainee.registrationservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
// Interacts with Student Service and fetches students full info using student id
public class StudentClient {
	
	private RestTemplate restTemplate;
	
	public StudentClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public StudentDTO getStudentById(int studentId) {
		String url = "http://localhost:8081/students/" + studentId;
		return restTemplate.getForObject(url, StudentDTO.class);
	}
}
