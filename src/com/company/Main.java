
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
        int[] numbers = {2,5,6,8,4,-10,56,17,-25};
        for (int a=0; a<numbers.length; a++)
            numbers[a].
    }
}
