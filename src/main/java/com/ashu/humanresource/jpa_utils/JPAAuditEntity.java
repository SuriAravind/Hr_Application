package com.ashu.humanresource.jpa_utils;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public abstract class JPAAuditEntity {

    @CreatedDate
    private Timestamp createdDate;

    @LastModifiedDate
    private Timestamp modifiedDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;

    private Long createdId;

    private Long modifiedId;

    @Builder.Default
    private Boolean isActive=true;
}
