package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance());
        equal(2,12,2);
        triangle(15, 2,20);
        multiplyByLength();
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
        int[] a ={2,3,4,5};
        int b = a.length;
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]*a.length+" ");
        }
    }

}
