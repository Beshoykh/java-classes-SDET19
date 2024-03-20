package org.example.class5march22024;

import java.util.Scanner;

public class PracticeLoop {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter YOur Grade Or -1 To exit ");
         int sum=0; int grade=0;
        int counter=1;
        while (counter<=5 && grade!=-1){
            System.out.println("Enter Grade Student Number" + counter);
             grade=scan.nextInt();
              sum+=grade;
               counter++;
        }
        System.out.println("Average is" + sum /5);
*/

        Scanner scan=new Scanner(System.in);

        int Counter=1; int grade=0;  int sum=0;
        while (Counter<=6){
            System.out.println("Enter Grade Student Number " + Counter);
            grade=scan.nextInt();
            sum+=grade;
            Counter++;

        }
        System.out.println("the average is " + sum/6);

    }
}
