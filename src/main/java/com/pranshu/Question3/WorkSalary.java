package com.pranshu.Question3;

import org.springframework.stereotype.Component;

@Component
public class WorkSalary implements Salary {
    public int salary(int baseSalary){
        return baseSalary + 5000;
    }
}
