package com.RESTAPI_2.mar_30_RestApi_2.controller.hateoass;

import com.RESTAPI_2.mar_30_RestApi_2.entities.User;
import com.RESTAPI_2.mar_30_RestApi_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {
    @Autowired
    UserService service;
    @GetMapping("/user")
    public List<User> getAllUser(){
        return service.getAllUser();
    }

    @GetMapping("/user/{id}")
    public EntityModel<User> getOneUser(@PathVariable int id){

        User user = service.getOneUser(id) ;

        EntityModel<User>entityModel = EntityModel.of(user) ;
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllUser());
        entityModel.add(link.withRel("Get All Users")) ;

        return  entityModel ;
    }
    @PostMapping("/user")
    public void postUser(@RequestBody User user){
        service.createUser(user);
    }
}
