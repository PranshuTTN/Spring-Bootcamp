
package com.pranshu.Question4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationContextProperties {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ApplicationContextProperties.class,args);
        CalculatingSalary calculatingSalary = applicationContext.getBean(CalculatingSalary.class);
//        applicationContext.getBean(WorkSalary.class);
        int result = calculatingSalary.calculatingSalary();
        System.out.println(result);
    }
}
