package com.hibernate.apr_4_JPA1.repository;

import com.hibernate.apr_4_JPA1.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//Q(2) Set up EmployeeRepository with Spring Data JPA
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String name);
    List<Employee> findByAgeBetween(int age1,int age2);
}
