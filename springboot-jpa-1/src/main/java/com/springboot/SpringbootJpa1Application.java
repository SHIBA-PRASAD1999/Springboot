package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.Entity.Student;
import com.springboot.Repository.studentRepository;

@SpringBootApplication
public class SpringbootJpa1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext contex = SpringApplication.run(SpringbootJpa1Application.class, args);
		studentRepository studentRepository = contex.getBean(studentRepository.class);

		Student s = new Student();
		s.setId(106);
		s.setName("Bikash");
		s.setRank((long) 1372);
		s.setGender("male");

		studentRepository.save(s);

//	
//		  Iterable<Student> st=studentRepository.getstudent();
//		  st.forEach(System.out::println);
//		 
//		 Iterable<Student> st=studentRepository.getrank(1270l);
//		 st.forEach(System.out::println);
		
		 Iterable<Student> st=studentRepository.getstd("male");
	     st.forEach(System.out::println);
		
	}

}
