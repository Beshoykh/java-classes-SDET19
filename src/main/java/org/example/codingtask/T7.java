package org.example.codingtask;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        //7.	Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci Series till " + n + " numbers is");
        for (int i = 1; i <= n;i++) {
            System.out.print(firstNumber+ " ,");
            // compute the next term
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }

}

