package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {

    @RequestMapping(value = "/")
    public String view(ModelMap map){ return "index"; }



    @RequestMapping("populate")
    public ModelAndView populate(@RequestParam("userName") String userName, @RequestParam("password") String password){
        User user1 = new User(userName,password);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("greeting1",user1.getUserName());
        return modelAndView;

    }
}
