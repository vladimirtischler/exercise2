package com.company;

import java.util.Calendar;
import java.util.Date;

public class Employee {
    String name;
    String username;
    Calendar dateOfBirth;
    JobPosition jobPosition;

    public Employee(String name, String username, Calendar dateOfBirth, JobPosition jobPosition) {
        this.name = name;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

}
