package com.studiosus.trainee.studentservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Generate getters, setters, toString, equals, and hashCode methods
@Data
//Generate a constructor with all arguments
@AllArgsConstructor
//Generate a no-argument constructor
@NoArgsConstructor
@Entity
@Table(name = "trainees")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "phonenumber")
	private String phoneNumber;
	@Column(name = "dateofbirth")
	private String dateOfBirth;
}
