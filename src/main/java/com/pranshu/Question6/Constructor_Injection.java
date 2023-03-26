
package com.pranshu.Question6;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Constructor_Injection {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Constructor_Injection.class,args);
        CalculatingSalary calculatingSalary = applicationContext.getBean(CalculatingSalary.class);
        int result = calculatingSalary.calculatingSalary();
        System.out.println(result);
    }
}
