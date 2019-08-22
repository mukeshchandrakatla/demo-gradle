package com.mukesh.practise.controller;

import com.mukesh.practise.model.UsersModel;
import com.mukesh.practise.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    @GetMapping(value="/users")
    //@ResponseBody
    public List<UsersModel> getUsersList(){
     return usersService.getUsers();
    }
}
