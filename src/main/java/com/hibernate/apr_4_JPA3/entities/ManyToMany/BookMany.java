package com.hibernate.apr_4_JPA3.entities.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class BookMany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "bookManySet")
    private Set<AuthorMany> authorManySet;

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

    public Set<AuthorMany> getAuthorManySet() {
        return authorManySet;
    }

    public void setAuthorManySet(Set<AuthorMany> authorManySet) {
        this.authorManySet = authorManySet;
    }

    @Override
    public String toString() {
        return "BookMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
