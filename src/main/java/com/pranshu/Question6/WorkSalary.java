package com.pranshu.Question6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WorkSalary implements Salary {
    public int salary(int baseSalary){
        return baseSalary + 5000;
    }
}
