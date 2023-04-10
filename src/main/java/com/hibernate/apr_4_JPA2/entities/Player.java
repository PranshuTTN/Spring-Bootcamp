package com.hibernate.apr_4_JPA2.entities;

import jakarta.persistence.*;

@Entity
//Joined Strategy
@Table(name = "player_join")
@Inheritance(strategy = InheritanceType.JOINED)
//Table Per Class Strategy
//@Table(name = "player")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
// Single Table Strategy
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "pmode",discriminatorType = DiscriminatorType.STRING)
public abstract class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jerseyNumber;
    private String name;

    public int getJerseyNumber() {
        return jerseyNumber;
    }

//    public void setJerseyNumber(int jerseyNumber) {
//        this.jerseyNumber = jerseyNumber;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
