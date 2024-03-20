package org.example.class4feb252024;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
       // Scanner scan= new Scanner(System.in);  //you have to write this piece of code each time using scanner
       // System.out.println(" Please Enter your age");
       // int age=scan.nextInt(); //the name that you used to system in is the one you NEXT(we are calling  NEXT method to take from the keyboard.
        //System.out.println("You are " + age + " Yours old");// to print out the keyboard reply with this message

        //Scanner scan=new Scanner(System.in);
       // System.out.println("Please enter the price of apples");
        //double price=scan.nextDouble();
        //System.out.println("Price is " + price);

        Scanner scan=new Scanner(System.in);
        System.out.println("Whats your name?");
        String name=scan.nextLine();
        System.out.println("Enter Your Age");
        int age=scan.nextInt();
        System.out.println("Enter your salary");
        double salary=scan.nextDouble();
        System.out.println("My name is "+ name + " I am " + age + " My salary is " + salary);









    }
}
