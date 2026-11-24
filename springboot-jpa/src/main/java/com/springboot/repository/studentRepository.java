package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.Entity.Student;

public interface studentRepository extends CrudRepository<Student, Integer> {

}
