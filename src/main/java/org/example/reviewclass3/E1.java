package org.example.reviewclass3;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        /*we have created a variable in type int  and calling the nextInt(); method to
        accept the int type data and storing it in the computer
         */
        // 10 20 40 50 using if statement to skip 30
        int num=10;
        while(num<=50){
            if (num!=30){
                System.out.println(num);
            }
            num+=10;
        }
    }
}
