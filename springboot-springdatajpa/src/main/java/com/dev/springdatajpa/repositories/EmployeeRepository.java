package com.dev.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.springdatajpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
