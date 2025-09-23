package com.studiosus.trainee.registrationservice;

import lombok.Data;

//Gets responses to return each registration along with student details
@Data
public class RegistrationResponse {
	private int registrationId;
	private int courseId;
	private StudentDTO student;
}
