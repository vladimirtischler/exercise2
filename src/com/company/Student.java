package com.company;

public class Student {
    String name;
    int studentNumber;

    public Student(String name, int studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }
    public String getName(){
     return name;
    }
    public int getStudentNumber(){
        return studentNumber;
    }

}
