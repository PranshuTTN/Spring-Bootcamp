package com.RESTAPI_2.mar_30_RestApi_2.services;

import com.RESTAPI_2.mar_30_RestApi_2.entities.User;
import com.RESTAPI_2.mar_30_RestApi_2.entities.Users;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static List<User> userList = new ArrayList<>();
    public List<User> getAllUser() {
        return userList;
    }

    public User getOneUser(int id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst().orElse(null) ;
    }
    public User createUser(User user){
        userList.add(user);
        return user;
    }
}
