package org.example.class5march22024;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = scan.nextInt();
        if (number >= 1 && number <= 10) {
            System.out.println("small");
        } else if (number >= 11 && number <= 100) {
            System.out.println("medium");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("large");
        } else {
            System.out.println("Invalid");
        }
    }
}
