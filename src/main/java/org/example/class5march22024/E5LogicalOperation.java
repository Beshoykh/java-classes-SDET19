package org.example.class5march22024;

import java.util.Scanner;

public class E5LogicalOperation {
    public static void main(String[] args) {
        // ! not
        // && and
        // ||  Or
        //Tasks
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Hights");
        int heights = scan.nextInt();
        if (heights < 60) {
            System.out.println("short");
        } else if (heights > 60 && heights < 72) {
            System.out.println("medium");
        } else {
            System.out.println("tall");
        }

    }
}
