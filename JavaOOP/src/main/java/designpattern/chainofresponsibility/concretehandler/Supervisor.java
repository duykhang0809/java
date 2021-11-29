package designpattern.chainofresponsibility.concretehandler;


import designpattern.chainofresponsibility.LeaveRequest;
import designpattern.chainofresponsibility.handler.Approver;

public class Supervisor extends Approver {
    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 3;
    }

    @Override
    protected void doApprove(LeaveRequest request) {
        System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
    }
}
