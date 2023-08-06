package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyLeaveRecordAdapter implements LeaveRecord{
    ThirdPartyLeaveRecord thirdPartyLeaveRecord;
    public String getMostAbsentEmployee() {

        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    };

    public int getEmployeeAbsences(String employeeName){
        Employee employee = new Employee(employeeName);

        return thirdPartyLeaveRecord.getEmployeeAbsences(employee);

    }
    ;
}


