package com.ashu.humanresource.employee.bean.response;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;


@Builder
@Getter
@Setter
public class EmployeeResponseBean extends RepresentationModel<EmployeeResponseBean> {

    private String employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    private Long phoneNo;
    private Date joinedDate;
    private String reportingTo;
    private String designation;
}
