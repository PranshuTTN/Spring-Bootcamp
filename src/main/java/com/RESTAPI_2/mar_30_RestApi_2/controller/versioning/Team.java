package com.RESTAPI_2.mar_30_RestApi_2.controller.versioning;

public class Team {
    private String firstName;
    private String lastName;
    private String teamName;
    public Team(String firstName, String lastName,String teamName) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.teamName=teamName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
