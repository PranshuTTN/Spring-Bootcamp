
package com.pranshu.Question5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Primary_display {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Primary_display.class,args);
        CalculatingSalary calculatingSalary = applicationContext.getBean(CalculatingSalary.class);
        int result = calculatingSalary.calculatingSalary();
        System.out.println(result);
    }
}
