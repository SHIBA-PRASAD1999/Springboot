package com.springboot;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.springboot.Entity.Student;
import com.springboot.Repository.studentRepository;

@SpringBootApplication
public class SpringbootJpaJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex =SpringApplication.run(SpringbootJpaJpaRepositoryApplication.class, args);
		studentRepository studentRepository = contex.getBean(studentRepository.class);
		
		/* PAGINATION CONCEPT IN SPRING DATA JPA(JPA REPOSITORY)
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Kindly enter the page number"); int start = sc.nextInt();
		 * int end=4;
		 * 
		 * PageRequest page = PageRequest.of(start-1, end);
		 * 
		 * Page<Student> all = studentRepository.findAll(page);
		 *  List<Student> content =all.getContent();
		   content.forEach(System.out::println);
		  */
		
		/*SORTING CONCEPT IN SPRING DATA JPA(JPA REPOSITORY)
		 * List<Student> student = studentRepository.findAll(Sort.by("name"));
		 * student.forEach(System.out::println);
		 */
		Student str=new Student();
		str.setGender("male");
		Example<Student> exp=Example.of(str);
		
	List<Student> st=studentRepository.findAll(exp);
	st.forEach(System.out::println);
		
	}

}
