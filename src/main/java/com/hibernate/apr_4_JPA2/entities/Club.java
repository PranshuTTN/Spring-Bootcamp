package com.hibernate.apr_4_JPA2.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
//Joined Strategy
//@Table(name = "club_join")
//@PrimaryKeyJoinColumn(name = "jerseyNumber")
//Table Per Class Strategy
//@Table(name = "club")
// Single Table Strategy
//@DiscriminatorValue(value = "cl")
@DiscriminatorValue("cl")
public class Club extends Player{
    private String clubName;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubName='" + clubName + '\'' +
                '}';
    }
}
