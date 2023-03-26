package com.pranshu.Question2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Employee_Loosely {
    private Salary s;
    Employee_Loosely(Salary s){
        this.s =s;
    }
    public int employeeSalary(){
        return s.salary(10000);
    }
    public static void main(String[] args) {
        Employee_Loosely el = new Employee_Loosely(new BonusSalary());
        int result = el.employeeSalary();
        System.out.println(result);
    }
}
