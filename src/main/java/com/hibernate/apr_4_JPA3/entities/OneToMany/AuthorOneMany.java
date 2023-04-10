package com.hibernate.apr_4_JPA3.entities.OneToMany;

import jakarta.persistence.*;

import java.util.Set;
@Entity
public class AuthorOneMany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(mappedBy = "authorOneMany",cascade = CascadeType.ALL)
    private Set<BookOneMany> bookOneManySet;
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

    public Set<BookOneMany> getBookOneManySet() {
        return bookOneManySet;
    }

    public void setBookOneManySet(Set<BookOneMany> bookOneManySet) {
        this.bookOneManySet = bookOneManySet;
    }

    @Override
    public String toString() {
        return "AuthorOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
