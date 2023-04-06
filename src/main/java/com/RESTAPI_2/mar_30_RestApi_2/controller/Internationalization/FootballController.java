package com.RESTAPI_2.mar_30_RestApi_2.controller.Internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class FootballController {
    @Autowired
    private MessageSource messageSource;
//    Q2. Create a GET request which takes "username" as param and
//    shows a localized message "Hello Username". (Use parameters in message properties)
    @GetMapping(path = "hello-username/{username}")
    public String helloUsername(@PathVariable String username){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("welcome.message",null,
                "Default Message",locale)+" "+ username;
    }
}
