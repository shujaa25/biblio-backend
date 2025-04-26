package com.ishujaa.BiblioBack.controllers;

import com.ishujaa.BiblioBack.dto.UserDTO;
import com.ishujaa.BiblioBack.model.UserEntity;
import com.ishujaa.BiblioBack.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserDTO register(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

}
