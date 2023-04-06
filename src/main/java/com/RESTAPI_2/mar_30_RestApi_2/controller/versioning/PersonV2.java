package com.RESTAPI_2.mar_30_RestApi_2.controller.versioning;

public class PersonV2 {
    private Team team;

    public PersonV2(Team team) {
        this.team = team;
    }

    public Team getName() {
        return team;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + team +
                '}';
    }
}
