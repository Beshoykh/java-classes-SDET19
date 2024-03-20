package org.example.class4feb252024;

public class Task3 {
    public static void main(String[] args) {
        // Task 3
        boolean degree = true;
        double gpa = 3.5;

        if (degree) {
            System.out.println("Congratulations");
            if (gpa >= 3.5) {
                System.out.println("You are eligible to SC");
            } else {
                System.out.println("You need to study harder");
            }
        } else {
            System.out.println("You should get a degree");
        }
        //Task 4
        double rate = 4;
        int price = 100000;
       /* Create a Java program and store values of mortgage
        rate and mortgage price. First, program should check if rate is
        higher than 4.5 user will not buy a house, otherwise user will
        consider buying. Once user decides to buy a house, if price of
        the house is larger than 100000 than user will take a loan,
        otherwise user will pay cash.*/

        if (rate < 4.5) {   // make sure to do it again because you can put if package under else cond
            System.out.println("Conseder Buying");
            if (price > 100000) {
                System.out.println("you will get a loan");
            } else {
                System.out.println("you will pay cash");
            }
        } else {
            System.out.println("You will not buying the house");
        }

        // Task 5   always check the requri
        int age = 19;
        int weight = 100;
        if (age >= 18) {
            if (weight > 110) {
                System.out.println("You are eligible to donate");
            } else {
                System.out.println("We Cannot accept");
            }

        } else {
            System.out.println("You are under 18 years old you cannot donate");

        }
        // Task 6       // we compaire the numbers together with each other with else if
        int num1 = 70;
        int num2 = 50;
        int num3 = 40;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " Is the largest");
            } else {
                System.out.println(num3 + " Is the largest");
            }
        } else if (num2 > num3)
            if (num2 > num3) {
                System.out.println(num2 + " Is the largest");
            } else {
                System.out.println(num3 + " Is the largest");
            }


    }
}
