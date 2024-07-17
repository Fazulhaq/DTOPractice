package com.mcit.DTOPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mcit.DTOPractice.dto.UserLocationDTO;
import com.mcit.DTOPractice.model.User;
import com.mcit.DTOPractice.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {

    @Autowired
    private UserService userService;
    /* This end point returns DTO for users location as response object */
    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
    /* This end point retuns User objects as response */
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    
}
