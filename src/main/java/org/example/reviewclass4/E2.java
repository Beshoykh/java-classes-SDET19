package org.example.reviewclass4;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        int[] number = {10, 25, 45, 66, 85, 100};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }System.out.println((sum/number.length));


        int[] numbers = {10, 25, 45, 66, 85, 100};
        int sum1 = 0;
        for (int n:numbers) {
            sum1 +=n;
        }System.out.println((sum/number.length));



    }
}








