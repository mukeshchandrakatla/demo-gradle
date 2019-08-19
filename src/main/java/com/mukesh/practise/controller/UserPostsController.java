package com.mukesh.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserPostsController {
    @GetMapping(value="/hello")
    @ResponseBody
    public String getDateAndTime(){
        String output = "hello world";
     return output;
    }
}
