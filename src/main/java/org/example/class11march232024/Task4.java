package org.example.class11march232024;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
      /*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter father name");
        String father=scan.nextLine();
        System.out.println("Enter mother name");
        String mother=scan.nextLine();
        System.out.println("Enter what do you expect boy or girl");
        String expect=scan.nextLine();
        if (expect.equalsIgnoreCase("Boy")){
            String firstHalf=father.substring(0, father.length()/2);
            String secondHalf=mother.substring(mother.length()/2, mother.length());
            System.out.println(firstHalf+secondHalf);
        }
        else if (expect.equalsIgnoreCase("Girl")){
            String firstHalf=mother.substring(0, mother.length()/2);
            String secondHalf=father.substring(father.length()/2, father.length());
            System.out.println(firstHalf+secondHalf);
        }






    }
}
