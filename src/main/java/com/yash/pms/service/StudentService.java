package com.yash.pms.service;

import java.util.Optional;
import com.yash.pms.model.Student;
import com.yash.pms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
    	studentRepository.save(student);
	    return student;
    }
    
    public Optional<Student> getStudentById(String name) {
    	Optional<Student> student= Optional.ofNullable(studentRepository.findByName(name));
    	return student;
    }
    
    public Student getByName(String name) {
    	Student student = studentRepository.findByName(name);
		return student;
   	}

}
