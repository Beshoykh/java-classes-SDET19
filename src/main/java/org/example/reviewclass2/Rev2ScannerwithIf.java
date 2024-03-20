package org.example.reviewclass2;

import java.util.Scanner;

public class Rev2ScannerwithIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age;
        age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Enter Your Weight");

        } else if (age < 18) {
            System.out.println("You re Not Eligible To Donate");
        }
        int weight;
        weight = scan.nextInt();
        if (weight >= 110) {
            System.out.println("You Can Donate");
        } else if (weight<110){
            System.out.println("You cannot Donate");
        }


    }


}

