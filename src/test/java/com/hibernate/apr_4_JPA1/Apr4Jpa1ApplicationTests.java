package com.hibernate.apr_4_JPA1;

import com.hibernate.apr_4_JPA1.entities.Employee;
import com.hibernate.apr_4_JPA1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class Apr4Jpa1ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	//Q(3) Perform Create Operation on Entity using Spring Data JPA
	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setName("Pranshu");
		employee.setAge(22);
		employee.setLocation("Delhi");

		Employee employee2 = new Employee();
		employee2.setName("Pratham");
		employee2.setAge(26);
		employee2.setLocation("Noida");

		Employee employee3 = new Employee();
		employee3.setName("Ankit");
		employee3.setAge(36);
		employee3.setLocation("Dwarka");

		employeeRepository.save(employee);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
	//Q(5) Perform Read Operation on Entity using Spring Data JPA
	@Test
	public void testRead(){
		System.out.println(employeeRepository.findAll());
	}
	//Q(4) Perform Update Operation on Entity using Spring Data JPA
	@Test
	public void testUpdate(){
		Employee employee = employeeRepository.findById(1).get();
		employee.setAge(30);
		employee.setName("Jai");
		employee.setLocation("Shimla");
		employeeRepository.save(employee);
	}
	//Q(5) Perform Delete Operation on Entity using Spring Data JPA
	@Test
	public void testDelete(){
		employeeRepository.deleteById(2);
	}
	//Q(6) Get the total count of the number of Employees
	@Test
	public void testCount(){
		System.out.println("Total Records: "+employeeRepository.count());
	}
	//Q(7) Implement Pagination and Sorting on the bases of Employee Age
	@Test
	public void testPagingSorting(){
		employeeRepository.findAll(
				PageRequest.of(0,2, Sort.Direction.DESC,"age"))
				.forEach(e-> System.out.println(e));
	}
	//Q(8) Create and use finder to find Employee by Name
	@Test
	public void testFindByName(){
		List<Employee> employees = employeeRepository.findByName("Pranshu");
		employees.forEach(e -> System.out.println("ID: "+e.getId()+", Age: "+e.getAge()));
	}
	//Q(9) Create and use finder to find Employees starting with A character
	@Test
	public void testFindByNameLike(){
		List<Employee> employees = employeeRepository.findByNameLike("A%");
		employees.forEach(e -> System.out.println(e.getName()));
	}
	//Q(10) Create and use finder to find Employees Between the age of 28 to 32
	@Test
	public void testFindByAgeBetween(){
		List<Employee> employees = employeeRepository.findByAgeBetween(28,32);
		employees.forEach(e -> System.out.println(e.getName()));
	}
}
