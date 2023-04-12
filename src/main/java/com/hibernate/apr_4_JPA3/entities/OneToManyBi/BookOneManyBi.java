package com.hibernate.apr_4_JPA3.entities.OneToManyBi;

import jakarta.persistence.*;
@Entity
public class BookOneManyBi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne
    private AuthorOneManyBi authorOneManyBi;
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

    public AuthorOneManyBi getAuthorOneMany() {
        return authorOneManyBi;
    }

    public void setAuthorOneMany(AuthorOneManyBi authorOneManyBi) {
        this.authorOneManyBi = authorOneManyBi;
    }

    @Override
    public String toString() {
        return "BookOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
