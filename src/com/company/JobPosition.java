package com.company;

public class JobPosition {
    String name;
    double salary;

    public JobPosition(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public  double getSalary(){
        return salary;
    }
}
