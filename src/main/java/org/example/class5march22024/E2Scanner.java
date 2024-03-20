package org.example.class5march22024;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a byte number");
        byte smallBox=scan.nextByte();
        System.out.println("Enter a double numbner");
        double bigBox=scan.nextDouble();
        System.out.println("Enter a boolean value");
        boolean logicalBox=scan.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);

    }
}
