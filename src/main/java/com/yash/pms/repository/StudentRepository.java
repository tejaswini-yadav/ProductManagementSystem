package com.yash.pms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.yash.pms.model.Student;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByName(String name);

}
