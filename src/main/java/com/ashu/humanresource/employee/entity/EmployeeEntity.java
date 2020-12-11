package com.ashu.humanresource.employee.entity;

import com.ashu.humanresource.employee.utils.StringPrefixedSequenceIdGenerator;
import com.ashu.humanresource.jpa_utils.JPAAuditEntity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

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
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "employee_seq")
    @GenericGenerator(name="employee_seq", parameters={@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),@Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value="Ashu_") , @Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value="%05d")}, strategy="com.ashu.humanresource.employee.utils.StringPrefixedSequenceIdGenerator")
    private String employeeId;
    /**
     * Person Info
     */
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailId;
    @OneToMany(mappedBy="employeeEntity", cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
    private List<AddressEntity> addressEntities;
    private Long phoneNo;
    /**
     * Official Info
     */
    private Date joinedDate;
    private String reportingTo; // employee Id
    private String designationId;
}
