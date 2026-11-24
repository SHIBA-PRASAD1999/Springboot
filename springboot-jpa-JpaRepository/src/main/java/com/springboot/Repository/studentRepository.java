package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entity.Student;

public interface studentRepository extends JpaRepository<Student, Integer> {

}
