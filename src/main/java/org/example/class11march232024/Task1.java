package org.example.class11march232024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // String str = new String("Java is Easy"); //original way to create
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter user name");
        String userName = scan.nextLine();
        System.out.println("Please enter password");
        String password = scan.nextLine();
        System.out.println("Please renter password");
        String confirmPassword = scan.nextLine();
        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("User and Password Can not be empty");
        } else if (password.length() <= 8) {
            System.out.println("Password too short");
        } else if (password.contains(userName)) {
            System.out.println("Password Cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password Do Not match");
        } else {
            System.out.println("Your username and password has been created");
        }


    }
}
