package com.hibernate.apr_4_JPA3.repository;

import com.hibernate.apr_4_JPA3.entities.OneToManyBi.AuthorOneManyBi;
import com.hibernate.apr_4_JPA3.entities.OneToManyUni.AuthorOneManyUni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorOneManyBiRepository extends JpaRepository<AuthorOneManyBi,Long> {
}
