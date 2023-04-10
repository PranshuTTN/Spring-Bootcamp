package com.hibernate.apr_4_JPA3.entities.OneToMany;

import jakarta.persistence.*;
@Entity
public class BookOneMany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorOneMany authorOneMany;
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

    public AuthorOneMany getAuthorOneMany() {
        return authorOneMany;
    }

    public void setAuthorOneMany(AuthorOneMany authorOneMany) {
        this.authorOneMany = authorOneMany;
    }

    @Override
    public String toString() {
        return "BookOneMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
