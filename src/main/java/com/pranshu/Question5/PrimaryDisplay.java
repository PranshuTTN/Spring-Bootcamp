
package com.pranshu.Question5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimaryDisplay {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(PrimaryDisplay.class,args);
        CalculatingSalary calculatingSalary = applicationContext.getBean(CalculatingSalary.class);
        int result = calculatingSalary.calculatingSalary();
        System.out.println(result);
    }
}
