package com.company;

import com.company.entity.Candidate;
import com.company.entity.Company;
import com.company.entity.Employee;
import com.company.enums.DismissalReason;
import com.company.service.UserFactory;

public class Main {

    public static void main(String[] args) {
        Candidate candidate = new Candidate(1, "Sergi", "Kolikov", "TITLE",
                "DESC", 500, DismissalReason.FAMILY_REASONS);
        Candidate candidate1 = new Candidate();
        UserFactory userFactory = new UserFactory();
        userFactory.getUser(candidate1);
        candidate1.info();
        Employee employee = new Employee(
                1, "Ss", "DD", "F", "f", 3200,
                new Company("OOO", "Volgrad", "SSS")
        );
        userFactory.getUser(employee);
    }
}
