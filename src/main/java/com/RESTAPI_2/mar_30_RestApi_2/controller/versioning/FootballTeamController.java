package com.RESTAPI_2.mar_30_RestApi_2.controller.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballTeamController {
//    Q10. Create 2 API for showing user details. The first api should return only basic details
//    of the user and the other API should return more/enhanced details of the user,
//    Now apply versioning using the following methods:
    //URI Versioning
    @GetMapping("/v2/person")
    public  PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Team("Pranshu","Saluja","PSG"));
    }
    //Request Parameter Versioning
    @GetMapping(path = "/person",params = "version=2")
    public  PersonV2 getSecondVersionOfPersonRequestParameter(){
        return new PersonV2(new Team("Pranshu","Saluja","PSG"));
    }
    //Custom Header Versioning
    @GetMapping(path = "/person",headers = "X-API-VERSION=2")
    public  PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Team("Pranshu","Saluja","PSG"));
    }
    //MimeType Versioning
    @GetMapping(path = "/person",produces = "application/vnd.company.app-v2+json")
    public  PersonV2 getSecondVersionOfPersonRequestAccept(){
        return new PersonV2(new Team("Pranshu","Saluja","PSG"));
    }
}
