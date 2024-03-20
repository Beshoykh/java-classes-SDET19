package org.example.class5march22024;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        System.out.println("How many years did you work");
        int work=scan.nextInt();
        if (work>=5){
            System.out.println("Enter Your Salary");
            int salary =scan.nextInt();
            if (salary>50000){
                System.out.println("Bonus 5000");
            }else{
                System.out.println("Bonus 3000");
            }
        } else{
            System.out.println("You Worked less Than 5 years");
        }



    }
}
