package com.hibernate.apr_4_JPA3.entities.OneToManyBi;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class AuthorOneManyBi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<BookOneManyBi> bookOneManyBiSet;
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

    public Set<BookOneManyBi> getBookOneManyBiSet() {
        return bookOneManyBiSet;
    }

    public void setBookOneManyBiSet(Set<BookOneManyBi> bookOneManyBiSet) {
        this.bookOneManyBiSet = bookOneManyBiSet;
    }

    @Override
    public String toString() {
        return "AuthorOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
