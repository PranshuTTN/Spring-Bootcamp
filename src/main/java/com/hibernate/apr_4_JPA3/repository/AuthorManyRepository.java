package com.hibernate.apr_4_JPA3.repository;

import com.hibernate.apr_4_JPA3.entities.ManyToMany.AuthorMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorManyRepository extends JpaRepository<AuthorMany,Integer> {
}
