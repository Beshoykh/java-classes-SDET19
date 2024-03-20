package org.example.class5march22024;

import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your city");
        String city=scan.nextLine();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter your Temp");
        double tem=scan2.nextDouble();
        double cel=(tem-32.0)*5.0/9.0; // we used double because of the coverter from Fer to Cel we use 5.0 to avoid bugs since we use double
        System.out.println(" The temp in The "+ city + " is " + cel + " °C");

    }
}
