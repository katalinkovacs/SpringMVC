package com.kati.service;

import com.kati.dao.EmployeeDAO;
import com.kati.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    EmployeeDAO dao;

    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}
