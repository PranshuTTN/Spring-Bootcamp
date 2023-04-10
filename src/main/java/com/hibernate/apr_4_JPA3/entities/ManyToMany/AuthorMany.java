package com.hibernate.apr_4_JPA3.entities.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class AuthorMany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "authormany_bookmany",
            joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private Set<BookMany> bookManySet;

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

    public Set<BookMany> getBookManySet() {
        return bookManySet;
    }

    public void setBookManySet(Set<BookMany> bookManySet) {
        this.bookManySet = bookManySet;
    }

    @Override
    public String toString() {
        return "AuthorMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
