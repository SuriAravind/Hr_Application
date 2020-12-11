package com.ashu.humanresource.employee.controller;

import com.ashu.humanresource.employee.bean.response.DesignationRequestBean;
import com.ashu.humanresource.employee.bean.resquest.EmployeeRequestBean;
import com.ashu.humanresource.employee.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by Suriyanarayanan K
 * on 08/12/20 10:29 PM.
 */
@RestController
@RequestMapping("/designation")
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    @PostMapping
    @Transactional
    public void addDesignation(@RequestBody DesignationRequestBean designationRequestBean) {
        designationService.saveDesignationEntity(designationRequestBean);
    }

   @GetMapping("/{id}")
    public DesignationRequestBean getAllDetails(@PathVariable("id") Long id) {
        return designationService.getAllDetails(id);

    }

    @GetMapping("/{id}/siblings")

    public ResponseEntity<Set<DesignationRequestBean>> getAllSiblings(@PathVariable("id") Long id) {
        return designationService.getAllSiblings(id);

    }
}
