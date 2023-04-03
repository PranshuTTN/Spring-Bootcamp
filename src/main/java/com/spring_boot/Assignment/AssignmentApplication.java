package com.spring_boot.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AssignmentApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employeeList = new ArrayList<>();
		for(int i=0;i<=5;i++){
			employeeList.add(new Employee("Name: "+i,i+"@gmail.com"));
		}
		employeeRepository.saveAll(employeeList);
	}
}
