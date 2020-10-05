
package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance());
        equal(2,12,2);
        triangle(15, 2,20);
        multiplyByLength();
        equalSlices(11,5,2);
        palindrome("mom");
        numbersMaxAndMin();
        warOfNumbers();
        Student student1 = new Student("Jano",20,1234567894,"Čadca 021 21");
        Student student2 = new Student("Sam",19,1469873212, "Čadca 023 11");
        System.out.println(student1.getName() + ": " + student1.getStudentNumber() + " , " + student1.getPhoneNumber() + " , "+ student1.getAddress());
        System.out.println(student2.getName() + ": " + student2.getStudentNumber() + " , " + student2.getPhoneNumber() + " , "+ student2.getAddress());
        People people1 = new People("Fero", 25, 25000);
        People people2 = new People("Jano", 27, 40000);
        People people3 = new People("Martin", 35,50000);
        System.out.println(people1.getBudget());
        Triangle triangle1 = new Triangle(21,23,35,15);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getArea());
        //game("paper", "scissors");
    }

    public static double totalDistance()
    {
        double heightOfStep = 0.2;
        double lenghtOfStep = 0.4;
        int towerHeight = 100;

        return towerHeight/heightOfStep * (lenghtOfStep+heightOfStep);
    }

    public static void equal(int a, int b, int c){

         if (a==b && b==c)
            System.out.println("3");
        else if (b==c)
            System.out.println("2");
        else if (a==c)
            System.out.println("2");
        else if (a==b)
            System.out.println("2");
        else if (a!=b && a!=c)
            System.out.println("0");
    }

    public static void triangle(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a )
            System.out.println("It is triangle.");
        else if (a + b < c)
            System.out.println("It isn´t triangle.");
        else if (a + b == c)
            System.out.println("It isn´t triangle.");

    }

    public static void multiplyByLength(){
        int[] a ={2,3,4,5,10};
        for (int i=0; i<a.length; i++) {
            a[i] = a[i]*a.length;
            System.out.println(a[i]+" ");
        }
    }

    public static void equalSlices(int totalSlices, int recipients, int slicesEach)
    {
        if (recipients * slicesEach <= totalSlices)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void palindrome(String word){
    StringBuffer reverseWord = new StringBuffer(word);
    String word1 = reverseWord.reverse().toString();
        if (word.equals(word1))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void numbersMaxAndMin(){
        int[] numbers = {2,5,-10,56,17,-125,25,56};
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length -1]);
    }

    //public static void game(String player1, String player2){
      //  String a = "paper";
        //String b = "scissors";
        //String c = "rock";

        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
       // if (player1.equals(b)&&player2.equals(a))
            //System.out.println("Win Player 1!");
        //if (player1.equals(c)&&player2.equals(a))
           // System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
           // System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");
        //if (player1.equals(a)&&player2.equals(b))
            //System.out.println("Win Player 2!");}

        public static void warOfNumbers(){ //nedokončená úloha
            int[] numbers = {2,5,9,12};
            for (int i=0; i<numbers.length;i++)
            {
                if (numbers[i]%2==0)
                    System.out.println(numbers[i]);
            }
        }

}
