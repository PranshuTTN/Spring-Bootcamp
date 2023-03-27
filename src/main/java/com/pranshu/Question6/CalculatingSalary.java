package com.pranshu.Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatingSalary {
    private Salary s;
    @Autowired
    public CalculatingSalary(Salary s){
        this.s =s;
    }
    public int calculatingSalary(){
        return s.salary(10000);
    }
}
