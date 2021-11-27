package com.company.entity;

import com.company.enums.DismissalReason;

public class Candidate extends User {
    private DismissalReason dismissalReason;

    public Candidate(int id, String firstName, String lastName, String jobTitle, String jobDescription, int jobSalary,
    DismissalReason dismissalReason) {
        super(id, firstName, lastName, jobTitle, jobDescription, jobSalary);
        this.dismissalReason = dismissalReason;
    }

    public Candidate() {
    }



    @Override
    public void info() {
        System.out.printf("Hello, I'm %s. \n" +
                        "I want to be a %s (%s) with a salary from %d. \n" +
                        "%s",
                super.getFullName(),
                super.getJobTitle(),
                super.getJobDescription(),
                super.getJobSalary(),
                this.dismissalReason != DismissalReason.NONE ? "I quit my previous job for a reason of " +
                        this.dismissalReason.getName()
                        :
                        "I haven't worked anywhere before.");
    }
}
