package com.dev.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev.springdatajpa.entities.Course;
import com.dev.springdatajpa.repositories.CourseRepository;

@SpringBootApplication
public class SpringbootSpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringbootSpringdatajpaApplication.class, args);
		CourseRepository repo = context.getBean(CourseRepository.class);
		//System.out.println(repo.getClass());
		//Insert operation
		/*Course c1 = new Course();
		c1.setCourseId("UI");
		c1.setCourseName("UI Full Stack");
		c1.setCourseDuration("3 Months");
		c1.setCourseFee(18000);
		repo.save(c1);*/
		//count()
		/*System.out.println("Number of Courses = "+ repo.count());*/
		//select operation based on primary key
		/*Course c = repo.findById("FSJ").get();
		System.out.println(c);*/
		//select all records
		/*Iterable<Course> courses =repo.findAll();
		//courses.forEach(c->System.out.println(c));//Lamda Expression
		courses.forEach(System.out::println); //method reference*/
		//Update operation
		/*Course c = repo.findById("FSJ").get();
		c.setCourseFee(25000);
		repo.save(c);*/
		//Delete Operation based on primary key
		/*if(repo.existsById("FJP"))
		   repo.deleteById("FJP");
		else 
			System.out.println("Course Id does not exis");*/
		//Delete all records
		repo.deleteAll();
	}

}
