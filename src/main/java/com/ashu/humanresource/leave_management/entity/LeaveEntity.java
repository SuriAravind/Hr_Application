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

//@Entity
//@Table(name="LEAVE")
public class LeaveEntity extends JPAAuditEntity {

    @Id
    private String id;
    private String employeeId;
    /*private String leaveTypeId;
    private Timestamp startDate;
    private Integer fromSession;
    private Timestamp endDate;
    private Integer toSession;
    private Integer numberOfDays;
    private String reason;*/
}
