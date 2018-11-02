package com.example.demo.service.user;

import java.util.Map;

import com.example.demo.model.User;

public interface UserService {

    User getUserInfoById(String uId);
    
    int getUserByName(String name);
    
    void register(Map<String,String> map);
}
