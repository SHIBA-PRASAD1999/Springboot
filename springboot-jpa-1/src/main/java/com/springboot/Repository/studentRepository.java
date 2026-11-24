package com.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.Entity.Student;

public interface studentRepository extends CrudRepository<Student, Integer>{
//	CUSTOME QUEARY USING SQL
	@Query(value = "select * from STUDENT_DTLS where student_gender='male'",nativeQuery = true)
	public List<Student> getstudent();
	
	@Query(value = "select * from STUDENT_DTLS where student_rank>=:rank",nativeQuery = true)
	public List<Student> getrank( Long rank);
	
//	CUSTOME QUEARY USING JPQL
//	@param annotation is optional
	@Query("FROM Student WHERE gender = :gender")
	public List<Student> getstd( String gender);
	
}
