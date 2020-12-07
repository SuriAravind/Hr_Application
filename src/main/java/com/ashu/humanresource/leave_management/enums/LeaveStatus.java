package com.ashu.humanresource.leave_management.enums;

/**
 * Created by Suriyanarayanan K
 * on 07/12/20 11:58 PM.
 */


public enum LeaveStatus {
    APPROVAL("Approval"), PENDING("Pending"), DECLINED("Declined");

    private String name;

    LeaveStatus(String name) {
        this.name=name;
    }
}
