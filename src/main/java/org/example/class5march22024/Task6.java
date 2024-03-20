package org.example.class5march22024;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter day number");
       int day=scan.nextInt();
        if (day==1 || day==2 || day==3 || day==4 || day==5){
            System.out.println("Weekday");
        }else if (day==6 || day==7){
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
