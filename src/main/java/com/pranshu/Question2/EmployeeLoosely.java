package com.pranshu.Question2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeLoosely {
    private Salary s;
    EmployeeLoosely(Salary s){
        this.s =s;
    }
    public int employeeSalary(){
        return s.salary(10000);
    }
    public static void main(String[] args) {
        EmployeeLoosely el = new EmployeeLoosely(new BonusSalary());
        int result = el.employeeSalary();
        System.out.println(result);
    }
}
