package org.example.class5march22024;

import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a credit Card?");
        boolean creditCard = scan.nextBoolean();
        if (creditCard){ // (creditCard.equalsIgnorecase( anotherString "Yes"))
            System.out.println("Whats balance");
            int balance=scan.nextInt();
            if (balance>=1000){
                System.out.println("Pay");}
            else{
                System.out.println("spend");}

        }else{
            System.out.println("Offer card");}

            // take the task one part in the time

    }
}
