package com.hibernate.apr_4_JPA3.entities.OneToOne;

import jakarta.persistence.*;

@Entity
public class AuthorOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private BookOne bookOne;
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

    public BookOne getBookOne() {
        return bookOne;
    }

    public void setBookOne(BookOne bookOne) {
        this.bookOne = bookOne;
    }

    @Override
    public String toString() {
        return "AuthorOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
