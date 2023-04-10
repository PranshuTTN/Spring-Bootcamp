package com.hibernate.apr_4_JPA3.entities.OneToOne;

import jakarta.persistence.*;

@Entity
public class BookOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne
    private AuthorOne authorOne;

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

    public AuthorOne getAuthorOne() {
        return authorOne;
    }

    public void setAuthorOne(AuthorOne authorOne) {
        this.authorOne = authorOne;
    }

    @Override
    public String toString() {
        return "BookOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
