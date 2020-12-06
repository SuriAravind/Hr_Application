package com.ashu.humanresource.employee.controller;

import com.ashu.humanresource.employee.bean.resquest.EmployeeRequestBean;
import com.ashu.humanresource.employee.entity.EmployeeEntity;
import com.ashu.humanresource.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Suriyanarayanan K
 * on 06/12/20 8:17 PM.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public void saveEmployee(@RequestBody EmployeeRequestBean employeeRequestBean) {
        employeeService.saveEmployeeEntity(employeeRequestBean);
    }
}
