package org.example.class5march22024;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       /* System.out.println("Enter Your Name");
        String name=scan.nextLine();  //Nextline used to execute the whole paragraphe
        System.out.println(name);      // Next only will execute only the first word */
        System.out.println("enter your Gender M/F");
        char gender=scan.next().charAt(0);   //next will execute one word plus charat(*) will execute the number of the text started 0 from the left.
        System.out.println(gender);


    }
}
