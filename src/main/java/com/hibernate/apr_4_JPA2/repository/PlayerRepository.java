package com.hibernate.apr_4_JPA2.repository;

import com.hibernate.apr_4_JPA2.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
}
