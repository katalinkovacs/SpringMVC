package com.kati.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/display")
public class DisplayDataController {


    // when invoked from browser using url /login then it will be a get
    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model) {

        ArrayList<String> kiddos = new ArrayList<>();
        kiddos.add("Sebastian");
        kiddos.add("Oliver");
        kiddos.add("Kornel");
        model.addAttribute("kiddos", kiddos);
        return "display";
    }


}
