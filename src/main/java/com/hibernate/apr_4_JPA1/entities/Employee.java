package com.hibernate.apr_4_JPA1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//Q(1) Create an Employee Entity which contains following fields
//Name
//Id
//Age
//Location
@Entity
public class Employee {
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
