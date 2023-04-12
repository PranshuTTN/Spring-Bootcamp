package com.hibernate.apr_4_JPA3.entities.OneToManyUni;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class AuthorOneManyUni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BookOneManyUni> bookOneManyUniSet;
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

    public Set<BookOneManyUni> getBookOneManyUniSet() {
        return bookOneManyUniSet;
    }

    public void setBookOneManyUniSet(Set<BookOneManyUni> bookOneManyUniSet) {
        this.bookOneManyUniSet = bookOneManyUniSet;
    }

    @Override
    public String toString() {
        return "AuthorOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
