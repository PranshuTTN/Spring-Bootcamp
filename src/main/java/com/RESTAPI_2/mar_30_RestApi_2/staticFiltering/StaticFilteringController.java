package com.RESTAPI_2.mar_30_RestApi_2.staticFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringController {
    @GetMapping("/filter")
    public StaticFiltering staticFilter(){
        return new StaticFiltering("Pranshu","Saluja","qwerty");
    }
}
