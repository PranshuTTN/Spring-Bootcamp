package com.pranshu.Question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatingSalary {
    @Autowired
    private Salary s;
    public CalculatingSalary(Salary s){
        this.s =s;
    }
    public int calculatingSalary(){
        return s.salary(10000);
    }
}
