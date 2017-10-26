package com.kati.dao;


import com.kati.model.EmployeeVO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    public List<EmployeeVO> getAllEmployees()
    {
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Katalin");
        vo1.setLastName("Kovacs");
        employees.add(vo1);

        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Andrea");
        vo2.setLastName("Kerekes");
        employees.add(vo2);

        return employees;
    }
}
