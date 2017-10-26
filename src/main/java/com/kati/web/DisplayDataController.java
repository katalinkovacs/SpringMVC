package com.kati.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/display")
public class DisplayDataController {


    // when invoked from browser using url /login then it will be a get
    @RequestMapping(method = GET)
    public String login(Model model) {

        ArrayList<String> kiddosList = new ArrayList<>();
        kiddosList.add("Sebastian");
        kiddosList.add("Oliver");
        kiddosList.add("Kornel");
        model.addAttribute("kiddos", kiddosList);   //name of attribute + value pair
        return "display";
    }


}
