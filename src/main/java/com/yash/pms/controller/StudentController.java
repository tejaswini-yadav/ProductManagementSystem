package com.yash.pms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.pms.model.Student;
import com.yash.pms.service.StudentService;
/**
 * Implementation of Get opertaion.
 * This implementation for Student Details
 * @author TejaswiniYadav
 */
@RestController
@RequestMapping("/StudentDetails")
public class StudentController {
	
	StudentService studentService;
	
	//Get Details of Student 
	@GetMapping(path="/getData")
	public Optional<Student> getDetails(@RequestParam(name = "studentName") String name) {
		Optional<Student> student = studentService.getStudentById(name);
		
		return student;
	}
	
	//Add Details of Student 
	@PostMapping("/addData")
	   public Student saveStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);
	}
}
