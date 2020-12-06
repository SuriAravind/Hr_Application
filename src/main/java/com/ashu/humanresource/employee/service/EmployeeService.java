package com.ashu.humanresource.employee.service;

import com.ashu.humanresource.employee.bean.resquest.EmployeeRequestBean;
import com.ashu.humanresource.employee.entity.EmployeeEntity;
import com.ashu.humanresource.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Suriyanarayanan K
 * on 06/12/20 8:40 PM.
 */

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployeeEntity(EmployeeRequestBean employeeRequestBean) {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        employeeEntity.setFirstName(employeeRequestBean.getFirstName());
        employeeEntity.setMiddleName(employeeRequestBean.getMiddleName());
        employeeEntity.setLastName(employeeRequestBean.getLastName());
        employeeEntity.setDesignation(employeeRequestBean.getDesignation());
        employeeEntity.setPhoneNo(employeeRequestBean.getPhoneNo());
        employeeEntity.setReportingTo(employeeRequestBean.getReportingTo());
        employeeEntity.setEmailId(employeeRequestBean.getEmailId());
        employeeEntity.setJoinedDate(new Date());
        employeeRepository.save(employeeEntity);
    }
}
