package com.company;

public class People {
    String name;
    int age;
    int budget;

    public People(String name, int age, int budget){
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public int getBudget() {
        budget += budget;
        return budget;
    }
}
