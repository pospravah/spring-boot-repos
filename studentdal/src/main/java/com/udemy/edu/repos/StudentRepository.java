package com.udemy.edu.repos;

import org.springframework.data.repository.CrudRepository;

import com.udemy.edu.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
