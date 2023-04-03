
package com.pranshu.Question3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsingAnnotations {
    @Autowired
    private Salary s;
    public UsingAnnotations(Salary s){
        this.s =s;
    }
    public int calculatingSalary(){
        return s.salary(10000);
    }
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(UsingAnnotations.class,args);
        CalculatingSalary calculatingSalary = applicationContext.getBean(CalculatingSalary.class);
        int result = calculatingSalary.calculatingSalary();
        System.out.println(result);
    }
}
