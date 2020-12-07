package com.ashu.humanresource.leave_management.entity;

/**
 * Created by Suriyanarayanan K
 * on 07/12/20 11:27 PM.
 */

import com.ashu.humanresource.jpa_utils.JPAAuditEntity;
import com.ashu.humanresource.leave_management.enums.LeaveSession;
import com.ashu.humanresource.leave_management.enums.LeaveStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="LEAVE_REQUEST")
public class LeaveRequestEntity extends JPAAuditEntity {

    @Id
    private String id;
    private String employeeId;
    private String leaveTypeId;
    private Timestamp fromDate;
    private LeaveSession fromSession;
    private Timestamp toDate;
    private LeaveSession toSession;
    private Integer numberOfDays;
    private String reason;
    private LeaveStatus leaveStatus;
}
