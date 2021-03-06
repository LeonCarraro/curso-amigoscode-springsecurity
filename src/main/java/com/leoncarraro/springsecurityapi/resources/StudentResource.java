package com.leoncarraro.springsecurityapi.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leoncarraro.springsecurityapi.models.Student;

@RestController
@RequestMapping(value = "api/v1/students")
public class StudentResource {

	private static final List<Student> STUDENTS = Arrays.asList(
		new Student(1L, "James Bond"),
		new Student(2L, "Maria Jones"),
		new Student(3L, "Anna Smith"));
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Student findById(@PathVariable Long id) {
		return STUDENTS.stream()
			.filter(s -> s.getId().equals(id))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("Student with ID " + id + " does not exists!"));
	}
	
}
