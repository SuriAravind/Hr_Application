package com.ashu.humanresource.employee.bean.resquest;

import com.ashu.humanresource.employee.entity.AddressEntity;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmployeeRequestBean {

    private String employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    private Long phoneNo;
    private Date joinedDate;
    private String reportingTo;
    private String designationId;
}
