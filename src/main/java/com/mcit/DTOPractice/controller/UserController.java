package com.mcit.DTOPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mcit.DTOPractice.dto.UserLocationDTO;
import com.mcit.DTOPractice.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }
    
}
