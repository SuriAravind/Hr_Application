package com.ashu.humanresource.leave_management.entity;

import com.ashu.humanresource.jpa_utils.JPAAuditEntity;

/**
 * Created by Suriyanarayanan K
 * on 07/12/20 11:42 PM.
 */
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
@Table(name="HOLIDAY")
public class HolidayEntity extends JPAAuditEntity {
    @Id
    private String id;
    private String name;
    private Timestamp date;
    private Boolean isRestricted;
}
