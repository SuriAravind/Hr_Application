package com.ashu.humanresource.employee.entity;

/**
 * Created by Suriyanarayanan K
 * on 06/12/20 7:38 PM.
 */

import com.ashu.humanresource.jpa_utils.JPAAuditEntity;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="ADDRESS")
public class AddressEntity extends JPAAuditEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    @ManyToOne
    @JoinColumn(name="employeeId")
    private EmployeeEntity employeeEntity;
}
