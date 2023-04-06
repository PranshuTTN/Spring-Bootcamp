package com.RESTAPI_2.mar_30_RestApi_2.services;

import com.RESTAPI_2.mar_30_RestApi_2.entities.Users;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UsersDaoService {

    private static List<Users> usersList = new ArrayList<>();
    static {
        usersList.add(new Users(1, "Pranshu", "Ashok Vihar"));
        usersList.add(new Users(2, "Divyanshu", "Model Town"));
        usersList.add(new Users(3, "Jai","Civil Lines"));
    }
//    Q5. Configure swagger plugin and create document of following methods:
//    Get details of User using GET request.
//    Save details of the user using POST request.
//    Delete a user using DELETE request.
    public List<Users> findAll(){
        return usersList;
    }
    public Users saveUser(Users user){
        usersList.add(user);
        return user;
    }
    public void deleteById(int id){
        Predicate<? super Users> predicate = user -> user.getUserId()==id;
        usersList.removeIf(predicate);
    }
}

