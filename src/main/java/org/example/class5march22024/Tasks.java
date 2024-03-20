package org.example.class5march22024;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        if (age>=18){
            System.out.println("Congrats, Will issue driver licence");

        }
        else{
            System.out.println("Sorry, You will get a learning permit ");}

    }
}
