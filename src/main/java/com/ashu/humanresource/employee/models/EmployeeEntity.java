package com.ashu.humanresource.employee.models;

import com.ashu.humanresource.jpa_utils.JPAAuditEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity extends JPAAuditEntity {

    @Id
    private String employeeId;
    /**
     * Person Info
     */
    private String firstName;
    private String middleName;
    private String lastName;
    @OneToMany(mappedBy="employee", cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
    private List<AddressEntity> addressEntities;
    private Long phoneNo;
    /**
     * Official Info
     */
    private Date joinedDate;
    private String reportingTo;
    private String designation;
}
