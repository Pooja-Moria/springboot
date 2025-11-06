package com.dev.springdatajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.dev.springdatajpa.entities.Employee;
import com.dev.springdatajpa.repositories.EmployeeRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
	  EmployeeRepository repo = context.getBean(EmployeeRepository.class);
       /* Employee e1 = new Employee(103,"Poo","SDE",100000);
        Employee e2 = new Employee(105,"RAM","Tester",700000);
        Employee e3 = new Employee(106,"SAM","Developer",600000);
        Employee e4 = new Employee(107,"Kim","Manager",750000);
        Employee e5 = new Employee(109,"Mary","QA",660000);
        Employee e6 = new Employee(102,"Ramya","HR",770000);
        Employee e7 = new Employee(101,"Purni","SDE",650000);
        Employee e8 = new Employee(103,"Samy","Developer",900000);
        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
        repo.saveAll(employees); */
		//Pagination
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter Page Number");
		int pageNum = s.nextInt();
		int pageSize = 3;*/
		/*List<Employee> employees = repo.findAll();
		employees.forEach(System.out::println);*/
		//page number will start from 0
		/*PageRequest pageRequest = PageRequest.of(pageNum-1, pageSize);//for us page starts from 0 for users it shows 1
		Page<Employee> pages = repo.findAll(pageRequest);
		List<Employee> employees = pages.getContent();
		employees.forEach(System.out::println);*/
		//Sorting
		/*List<Employee> employees = repo.findAll(Sort.by("empName").descending());
		employees.forEach(System.out::println);*/
	  List<Employee> employees = repo.findAll(Sort.by("empSalary"));
		employees.forEach(System.out::println);
	}
}
