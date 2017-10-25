package com.kati.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    // when invoked from browser using url /login then it will be a get
    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute("userName", "Stranger");         // NOT PRINTED ON SERVER!!!!!!!!!! --> NULL
        model.addAttribute("password" , "StrangerPassword");
        return "login";
    }


    // when invoked from browser page click on submit then it will be a post
    // spring automaticall try to bind the form field with the supplied argument here it is User
    @RequestMapping( method = RequestMethod.POST)
    public String loginPost(User formData, Model model) {
        model.addAttribute("userName", formData.getUserName());
        model.addAttribute("password" , formData.getPassword());
        return "welcome";
    }
}
