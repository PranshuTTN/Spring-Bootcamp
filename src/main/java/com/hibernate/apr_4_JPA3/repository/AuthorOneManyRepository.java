package com.hibernate.apr_4_JPA3.repository;

import com.hibernate.apr_4_JPA3.entities.OneToMany.AuthorOneMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorOneManyRepository extends JpaRepository<AuthorOneMany,Long> {
}
