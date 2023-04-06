package com.RESTAPI_2.mar_30_RestApi_2.controller;

import com.RESTAPI_2.mar_30_RestApi_2.entities.Users;
import com.RESTAPI_2.mar_30_RestApi_2.services.UsersDaoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private UsersDaoService service;
    @Autowired
    UsersController(UsersDaoService service){
        this.service=service;
    }
    // Add dependency jackson-dataformat-xml for xml input and output
    //Q4. Create GET Method to fetch the list of users in XML format.
    @Operation(summary = "Get All Users")
    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return service.findAll();
    }
    //Q3. Create POST Method to create user details which can accept XML for user creation.
    @Operation(summary = "Create new User")
    @PostMapping("/users")
    public Users createUser(@RequestBody Users user){
        Users savedUser = service.saveUser(user);
        return savedUser;
    }
    //Q7. In swagger documentation, add the description of each class and URI
    // so that in swagger UI the purpose of class and URI is clear.
    @Operation(summary = "Delete User by ID")
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }
}
