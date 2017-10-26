package com.kati.controller;

import com.kati.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
@RequestMapping("/employee-module")
public class EmployeeController {

    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/getAllEmployees", method = GET)

    public String getAllEmployees(org.springframework.ui.Model model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
}
