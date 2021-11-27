package com.company.entity;

import com.company.enums.DismissalReason;
import com.company.service.IDisplayable;

public abstract class User implements IDisplayable {
    private int id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String jobDescription;
    private int jobSalary;

    public User(int id, String firstName, String lastName, String jobTitle, String jobDescription, int jobSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobSalary = jobSalary;
    }

    public User() {
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getJobSalary() {
        return jobSalary;
    }
}
