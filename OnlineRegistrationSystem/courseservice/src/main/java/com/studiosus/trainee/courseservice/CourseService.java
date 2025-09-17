package com.studiosus.trainee.courseservice;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	// Save course to database
	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}
	
	// Get all courses from database
	public List<Course> getCoursesByStudentId(int studentId) {
		return courseRepository.findByStudentId(studentId);
	}
	
	// Get all courses from database
	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

}
