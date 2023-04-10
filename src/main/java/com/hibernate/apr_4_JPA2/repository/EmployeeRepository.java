package com.hibernate.apr_4_JPA2.repository;

import com.hibernate.apr_4_JPA2.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("select firstName,lastName from Employee where salary>(select AVG(salary) from Employee) order by age ASC,salary DESC")
    public List<Object[]> findAllStudentsPartialData();
    @Modifying
    @Query("update Employee set salary=:newSalary where salary<:avgSalary")
    void updateSalary(@Param("newSalary") int newSalary,@Param("avgSalary") int avgSalary);
    @Query("select avg(salary) from Employee")
    public Integer findAvgSalary();
    @Modifying
    @Query("delete from Employee where salary=:minSalary")
    void deleteEmployeeByMinSalary(@Param("minSalary") int minSalary);
    @Query("select min(salary) from Employee")
    public Integer findMinSalary();

    //Native SQL Query
    @Query(value = "select emp_id,emp_first_name,emp_age from employee_table where emp_last_name='singh'"
            ,nativeQuery = true)
    public List<Object[]> findStudentsByLastNameNQ();
    @Modifying
    @Query(value = "delete from employee_table where emp_age>:age1",nativeQuery = true)
    public void deleteByAgeNQ(@Param("age1") int age1);
}
