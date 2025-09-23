package com.studiosus.trainee.registrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentClient {

	private final RestTemplate restTemplate;
	private final String studentServiceUrl;

	public StudentClient(RestTemplate restTemplate, @Value("${student.service.url}") String studentServiceUrl) {
		this.restTemplate = restTemplate;
		this.studentServiceUrl = studentServiceUrl;
	}

	public StudentDTO getStudentById(int studentId) {
		String url = studentServiceUrl + "/students/" + studentId;
		return restTemplate.getForObject(url, StudentDTO.class);
	}
}
