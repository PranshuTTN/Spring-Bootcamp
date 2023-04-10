package com.hibernate.apr_4_JPA2.entities;

import jakarta.persistence.*;

@Entity
//Joined Strategy
@Table(name = "country_join")
@PrimaryKeyJoinColumn(name = "jerseyNumber")
//Table Per Class Strategy
//@Table(name = "country")
// Single Table Strategy
//@DiscriminatorValue("co")
//@DiscriminatorValue(value="co")
public class Country extends Player{
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
