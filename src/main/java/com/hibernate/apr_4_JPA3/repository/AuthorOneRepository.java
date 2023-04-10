package com.hibernate.apr_4_JPA3.repository;

import com.hibernate.apr_4_JPA3.entities.OneToOne.AuthorOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorOneRepository extends JpaRepository<AuthorOne,Integer> {
}
