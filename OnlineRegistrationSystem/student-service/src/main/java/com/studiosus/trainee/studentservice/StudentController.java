package com.studiosus.trainee.studentservice;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	private StudentService studentService;
	
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	// Retrieve a list of all students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}

	// Add a new student
	@PostMapping("/students")
	public Student addStudents(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	// Get a student by ID
	//@PathVariable extracts the value from the URI
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
	    Student student = studentService.getStudentById(id);
	    if (student != null) {
	    	// Return HTTP 200 OK with the student data if found
	        return ResponseEntity.ok(student);
	    } else {
	    	// Return HTTP 404 Not Found if the student does not exist
	        return ResponseEntity.notFound().build();
	    }
	}

}