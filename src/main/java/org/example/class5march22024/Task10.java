package org.example.class5march22024;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Quiz Scores ");
        double quiz=scan.nextDouble();
        System.out.println("Enter your Med Term Scores ");
        double medTerm=scan.nextDouble();
        System.out.println("Enter your Final Scores ");
        double finalScores=scan.nextDouble();
        double averageScore=(quiz+medTerm+finalScores)/3;
        if (averageScore>=90){
            System.out.println("Your Grade Is A");
        }else if (averageScore>=70){
            System.out.println("Your Grade Is B");
        }else if (averageScore>=50){
            System.out.println("Your Grade Is C");
        }else{
            System.out.println("Your Grade Is F");
        }


    }
}
