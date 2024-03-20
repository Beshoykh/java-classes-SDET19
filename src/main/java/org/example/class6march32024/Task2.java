package org.example.class6march32024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Grade");
        char grade = scan.next().toLowerCase().charAt(0);
        if (grade == 'a') {
            System.out.println("which grade was entered by a user with explanation Excellent");
        }
        if (grade == 'b') {
            System.out.println("which grade was entered by a user with explanation Good");
        }
        if (grade == 'c') {
            System.out.println("which grade was entered by a user with explanation Average");
        }
        if (grade == 'd') {
            System.out.println("which grade was entered by a user with explanation Bad");
        } else {
            System.out.println("Not Acceptable");
        }// make it again with switch later
    }
}
