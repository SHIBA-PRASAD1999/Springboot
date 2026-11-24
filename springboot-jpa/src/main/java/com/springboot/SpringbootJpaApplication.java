package com.springboot;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.Entity.Student;
import com.springboot.repository.studentRepository;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootJpaApplication.class, args);
		studentRepository studentRepository = context.getBean(studentRepository.class);

		Student s = new Student();
		s.setId(106);
		s.setName("Resma");
		s.setRank((long) 1372);
		s.setGender("Female");

		studentRepository.save(s);
		studentRepository.deleteById(106);

		Optional<Student> optional = studentRepository.findById(107);

		if (optional.isPresent()) {
			Student st = optional.get();
			System.out.println(st);

		} else {
			System.out.println("No such record found in the given ID");

		}
		Iterable<Student> findall = studentRepository.findAll();
		{
			findall.forEach(System.out::println);
		}

	}
}
