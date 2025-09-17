package com.studiosus.trainee.courseservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	private CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	// Add a new course
	@PostMapping("/students/courses")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	// Retrieve a list of all courses for a specific student by their ID
	@GetMapping("/students/{studentId}/courses")
	public List<Course>getCoursesByStudentId(@PathVariable int studentId){
		return courseService.getCoursesByStudentId(studentId);
	}
	
	// Retrieve a list of all courses
	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getAllCourses(); 
	}
}
