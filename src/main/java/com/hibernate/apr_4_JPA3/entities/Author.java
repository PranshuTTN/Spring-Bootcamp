package com.hibernate.apr_4_JPA3.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Embedded
    Address address;
    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
    private Set<Subject> subjects;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
    public void addSubject(Subject subject){
        if(subject!=null){
            if (subjects==null){
                subjects=new HashSet<>();
            }
            subject.setAuthor(this);
            subjects.add(subject);
        }
    }
}
