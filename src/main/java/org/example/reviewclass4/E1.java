package org.example.reviewclass4;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=0;
        do{
            System.out.println("enter the number");
            number=scan.nextInt();
        }while (number<10);
    }
}

