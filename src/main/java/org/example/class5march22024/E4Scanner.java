package org.example.class5march22024;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in); // Create scan 2 to avoid the Clear buffer memory problems as well
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("Enter your Full Name");
        //scan.nextLine();  // Nest scan.nextline to give us a chance to see next request OR clear the buffer memory
        String fullName=scan2.nextLine();
        System.out.println("Your name is " + fullName + " you are " + age + " years old");
        // Or you Can cerate 2 scanner use one with age and scanner 2 with the full name


    }
}
