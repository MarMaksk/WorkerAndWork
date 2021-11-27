package com.company.entity;

import java.util.Objects;

public class Employee extends User {
    private Company company;

    public Employee(int id, String firstName, String lastName, String jobTitle, String jobDescription, int jobSalary,
                    Company company) {
        super(id, firstName, lastName, jobTitle, jobDescription, jobSalary);
        this.company = company;
    }

    public Employee() {
    }

    @Override
    public void info() {
        System.out.printf("Hello, I'm %s, %s in %s (%s, %s, %s) and my salary %d",
                super.getFullName(),
                super.getJobTitle(),
                this.company.getCompanyCountry(),
                this.company.getCompanyCity(),
                this.company.getCompanyAdress(),
                super.getJobSalary());
    }


}
