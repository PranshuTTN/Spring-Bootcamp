package com.hibernate.apr_4_JPA2;

import com.hibernate.apr_4_JPA2.entities.Club;
import com.hibernate.apr_4_JPA2.entities.ComponentMapping.Employeee;
import com.hibernate.apr_4_JPA2.entities.ComponentMapping.Salary;
import com.hibernate.apr_4_JPA2.entities.Country;
import com.hibernate.apr_4_JPA2.entities.Employee;
import com.hibernate.apr_4_JPA2.repository.EmployeeRepository;
import com.hibernate.apr_4_JPA2.repository.EmployeeeRepository;
import com.hibernate.apr_4_JPA2.repository.PlayerRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class Apr4Jpa2ApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	EmployeeeRepository employeeeRepository;
	@Test
	public void testCreate(){
		Employee employee = new Employee();
		employee.setFirstName("Pranshu");
		employee.setLastName("singh");
		employee.setSalary(30000);
		employee.setAge(22);

		Employee employee2 = new Employee();
		employee2.setFirstName("Jai");
		employee2.setLastName("Bhasin");
		employee2.setSalary(10000);
		employee2.setAge(25);

		Employee employee3 = new Employee();
		employee3.setFirstName("Jai");
		employee3.setLastName("singh");
		employee3.setSalary(30000);
		employee3.setAge(22);

		employeeRepository.save(employee);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
	@Test
	public void testFindAllStudentsPartialData(){
		List<Object[]> partialData = employeeRepository.findAllStudentsPartialData();
		for(Object[] objects:partialData){
			System.out.println(objects[0]+" "+objects[1]);
		}
	}
	@Test
	@Transactional
	@Rollback(value = false)
	public void testUpdateSalary(){
		employeeRepository.updateSalary(50000,employeeRepository.findAvgSalary());
	}
	@Test
	@Transactional
//	@Rollback(value = false)
	public void testDeleteEmployeeByMinSalary(){
		employeeRepository.deleteEmployeeByMinSalary(employeeRepository.findMinSalary());
	}
	@Test
	public void testFindStudentsByLastNameNQ(){
		List<Object[]> partialData = employeeRepository.findStudentsByLastNameNQ();
		for(Object[] objects:partialData){
			System.out.println(objects[0]+" "+objects[1]+" , "+objects[2]);
		}
	}
	@Test
	@Transactional
	public void testDeleteByAgeNQ(){
		employeeRepository.deleteByAgeNQ(45);
	}

	//Inheritance Mapping
	@Test
	public void testCreatePlayerClub() {
		Club cl = new Club();
		cl.setJerseyNumber(7);
		cl.setName("Pranshu");
		cl.setClubName("Barcelona");
		playerRepository.save(cl);
	}
	@Test
	public void testCreatePlayerCountry() {
		Country co = new Country();
		co.setJerseyNumber(11);
		co.setName("Pranshu");
		co.setCountryName("India");
		playerRepository.save(co);
	}
	//Component Mapping
	@Test
	public void testCreateEmployeee(){
		Employeee employeee = new Employeee();
		employeee.setId(11);
		employeee.setFirstname("Yaman");
		employeee.setLastname("Saluja");
		employeee.setAge(25);
		Salary salary = new Salary();
		salary.setBasicsalary(100000l);
		salary.setBonussalary(30000l);
		salary.setSpecialallowancesalary(10000l);
		salary.setTaxamount(5000l);
		employeee.setSalary(salary);
		employeeeRepository.save(employeee);
	}
}
