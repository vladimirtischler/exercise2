
package com.company;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(totalDistance());
        System.out.println(equal(2,12,2));
        System.out.println(Arrays.toString(multiplyByLength(new int[]{2,3,4,5,10})));
        System.out.println(triangle(15, 2,20));
        System.out.println(equalSlices(11,5,2));
        System.out.println(palindrome("mom"));
        System.out.println(numbersMaxAndMin(new int[]{2,5,-10,56,17,-125,25,56}));
        System.out.println(warOfNumbers(new int[] {3,15,5,16,4}));
        System.out.println(captureTheRook(new String[]{"B8","A8"}));

        Student student1 = new Student("Jano",20,1234567894,"Čadca 021 21");
        Student student2 = new Student("Sam",19,1469873212, "Čadca 023 11");
        System.out.println(student1.getName() + ": " + student1.getStudentNumber() + " , " + student1.getPhoneNumber() + " , "+ student1.getAddress());
        System.out.println(student2.getName() + ": " + student2.getStudentNumber() + " , " + student2.getPhoneNumber() + " , "+ student2.getAddress());

        Person person1 = new Person("Fero", 25, 25000);
        Person person2 = new Person("Jano", 27, 40000);
        Person person3 = new Person("Martin", 35,50000);
        System.out.println(totalBudget(new Person[]{person1,person2,person3}));

        Triangle triangle1 = new Triangle(21,23,35,15);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getArea());

        Employee employee1 = new Employee("Vlado", "Hrach", new GregorianCalendar(2002,7,8), new JobPosition("IT Programmer",4000));
        Employee employee2 = new Employee("Adrian","Kuzma", new GregorianCalendar(2003,3,6), new JobPosition("Military",4500));
        System.out.println("Employe:"+employee1.getName()+" "+employee1.getUsername()+", "+ employee1.getJobPosition().getName()+", "+ employee1.getJobPosition().getSalary()+"Eur");
        System.out.println("Employe:"+employee2.getName()+" "+employee2.getUsername()+", "+ employee2.getJobPosition().getName()+", "+ employee2.getJobPosition().getSalary()+"Eur");

        Item item1 = new Item("knife",35);
        Item item2 = new Item("ax",50);
        Item item3 = new Item("gun",65);
        Item item4 = new Item("sword",50);
        Item[] items1 = {item1,item3};
        Item[] items2 = {item2,item4};
        Warior warior1 = new Warior("Martin",10,8,9, items1);
        Warior warior2 = new Warior("Fero",10, 6,8, items2);
    }

    public static double totalDistance()
    {
        double heightOfStep = 0.2;
        double lenghtOfStep = 0.4;
        int towerHeight = 100;

        return towerHeight/heightOfStep * (lenghtOfStep+heightOfStep);
    }

    public static int equal(int a, int b, int c){

        if (a==b && b==c)
            return 3;
        else if (b==c)
            return 2;
        else if (a==c)
            return 2;
        else if (a==b)
            return 2;
        else if (a!=b && a!=c)
            return 0;
        return 0;
    }

    public static boolean triangle(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a )
            return true;
        else if (a + b < c)
            return false;
        else if (a + b == c)
            return false;
        return false;
    }

    public static int[] multiplyByLength(int[] a){
        for (int i=0; i<a.length; i++) {
            a[i] = a[i]*a.length;
        }
        return a;
    }

    public static boolean equalSlices(int totalSlices, int recipients, int slicesEach)
    {
        if (recipients * slicesEach <= totalSlices)
            return true;
        else
            return false;
    }

    public static Boolean palindrome(String word){
    StringBuffer reverseWord = new StringBuffer(word);
    String word1 = reverseWord.reverse().toString();
        if (word.equals(word1))
            return true;
        else
            return false;
    }

    public static String numbersMaxAndMin(int[] numbers){
        Arrays.sort(numbers);
        return (numbers[0]+" "+numbers[numbers.length -1]);
    }

    public static int warOfNumbers(int[] numbers){
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i=0; i<numbers.length;i++)
        {
               if (numbers[i]%2==0) {
                   evenNumbers = numbers[i] + evenNumbers;
               }
               else {
                   oddNumbers+=numbers[i];
               }
        }
        if (evenNumbers>oddNumbers)
            return (evenNumbers - oddNumbers);

        else
            return(oddNumbers-evenNumbers);

    }

    public static boolean captureTheRook(String[] canCapture){
        var firstRook = canCapture[0].toCharArray();
        var secondRook = canCapture[1].toCharArray();
        for (int i=0;i<firstRook.length;i++){
            if(firstRook[i]==secondRook[i]) return true;
        }
        return false;
    }

    public static int totalBudget(Person[] people){
        int budget = 0;
        for (int i = 0; i<people.length;i++){
            budget += people[i].getBudget();
        }
        return budget;
    }
}
