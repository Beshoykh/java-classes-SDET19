package org.example.class6march32024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
Just do this for any 5 countries

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Country Name");
        String county=scan.nextLine().toLowerCase(); //  .equalIgnoreCase() method works with boolean false or true
        switch (county){                             // .toLowerCase(); method works with Strings
            case "usa":
                System.out.println("We Speak English");
                break;
            case "spain":
                System.out.println("We Speak Spanish");
                break;
            case "russia":
                System.out.println("We Speak Russian");
                break;
            case "egypt":
                System.out.println("We Speak Arabic");
                break;
            default:
                System.out.println("Not Supported");
        }


    }
}
