package org.example.reviewclass2;

import java.util.Scanner;

public class Rev2IfStatementAndRela {
    public static void main(String[] args) {
        // Scanner scan=new Scanner(System.in);
        // System.out.println("Enter your balance");

        // int balance=scan.nextInt();

        //if (balance>50000){
        // System.out.println("You are rich");
        // String  day="Sunday"; //Should never use String NON primitive data type with relation operatore ==
        // Use it this way if(day.equals(Sunday)){   .......
        // else if better than many if est because the computer once found the result will ignore the rest and will move faster and the code will be easy to read.
        String day = "Friday";
        if (day.equals("Monday")) {
            System.out.println("Work");
        } else if (day.equals("Tuesday")) {
            System.out.println("Work");
        } else if (day.equals("Wedesday")) {
            System.out.println("Work");
        } else if (day.equals("Thursday")) {
            System.out.println("Work");
        } else if (day.equals("Friday")) {
            System.out.println("Work");
        } else if (day.equals("Saturday")) {
            System.out.println("Work");
        } else if (day.equals("Sunday")) {
            System.out.println("Work");
        } else {
            System.out.println("Wrong Day");
        }



    }


}

