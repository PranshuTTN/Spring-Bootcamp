package com.hibernate.apr_4_JPA3.entities.OneToManyUni;

import jakarta.persistence.*;
@Entity
public class BookOneManyUni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
