package com.ashu.humanresource.leave_management.entity;

/**
 * Created by Suriyanarayanan K
 * on 07/12/20 11:28 PM.
 */

import com.ashu.humanresource.jpa_utils.JPAAuditEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="LEAVE_TYPE")
public class LeaveType extends JPAAuditEntity {
    @Id
    private String id;
    private String typeName;
    private Long numberOfLeaves;
}
