package com.mukesh.practise.controller;

import com.mukesh.practise.dao.UsersDaoInterface;
import com.mukesh.practise.model.UsersModel;
import com.mukesh.practise.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private UsersDaoInterface usersDaoInterface;
    @GetMapping(value="/users")
    //@ResponseBody
    public List<UsersModel> getUsersList(){
     return usersService.getUsers();
    }

    @GetMapping(value = "/userDetails")
    public List<UsersModel> postUserDetails(){
        return usersService.postUserDetails();
    }
    @GetMapping(value = "/all")
    public List<UsersModel> getAll(){return usersDaoInterface.findAll();}
    @PostMapping(value = "/loadAll")
    public List<UsersModel> persist(@RequestBody final UsersModel users){
        usersDaoInterface.save(users);
        return  usersDaoInterface.findAll();
    }
}
