package com.studiosus.trainee.registrationservice;

import lombok.Data;

// Data Transfer Object for Student
// Used to transfer student data between different layers of the application
@Data
public class StudentDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String dateOfBirth;
}
