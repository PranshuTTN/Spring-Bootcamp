package com.hibernate.apr_4_JPA2.repository;

import com.hibernate.apr_4_JPA2.entities.ComponentMapping.Employeee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeeRepository extends JpaRepository<Employeee,Integer> {
}
