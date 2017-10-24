package com.kati.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
/*
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(){

        return "Hellobello!";

    }*/

    @RequestMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("usernameOnJSP", "Stranger");
        model.addAttribute("passwordOnJSP" , "StrangerPassword");
        return "login";
    }
}
