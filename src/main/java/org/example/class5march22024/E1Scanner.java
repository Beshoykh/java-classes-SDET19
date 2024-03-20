package org.example.class5march22024;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age");
        age=scan.nextInt();
        if (age>=18){
            System.out.println("You Can Vote");}
        else{
            System.out.println("You Need To Wait");}
        }
    }

