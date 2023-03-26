package com.pranshu.Question6;

import org.springframework.stereotype.Component;

@Component
public class BonusSalary implements Salary {
    public int salary(int baseSalary){
        return baseSalary + 1000;
    }
}
