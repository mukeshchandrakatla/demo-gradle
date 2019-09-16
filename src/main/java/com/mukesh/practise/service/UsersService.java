package com.mukesh.practise.service;

import com.mukesh.practise.dao.UsersDaoInterface;
import com.mukesh.practise.model.UsersModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
    private UsersDaoInterface usersDaoInterface;
    private List<UsersModel> Users = new ArrayList<UsersModel>(Arrays.asList(new UsersModel(1,"mukesh","katla")));
    public List<UsersModel> getUsers(){
        return Users;
    }
    public List<UsersModel> postUserDetails(){
        return Details;
    }
    private List<UsersModel> Details = new ArrayList<UsersModel>();
}
