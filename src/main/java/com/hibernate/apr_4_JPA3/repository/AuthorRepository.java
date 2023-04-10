package com.hibernate.apr_4_JPA3.repository;

import com.hibernate.apr_4_JPA3.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
