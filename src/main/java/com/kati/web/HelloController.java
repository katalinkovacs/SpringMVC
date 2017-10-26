package com.kati.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.element.Name;
import java.util.jar.Attributes;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping( method = GET )
    public String hi() {

        return "hello";
    }


    @RequestMapping( method = POST )
    public String afterSubmit(User formData, Model model) {
        model.addAttribute("Name", formData.getName());

        if(formData.getName().equals("Katalin")){
            return "happy";
        }
        else {
            return "sad";              // View name
        }
    }


}
