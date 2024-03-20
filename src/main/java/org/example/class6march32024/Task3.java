package org.example.class6march32024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
        Please complete this assignment in 2 ways: using if statement and switch case.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Numbers");
        double number1=scan.nextDouble();
        System.out.println("Enter operator character");
        char operator=scan.next().charAt(0);
        System.out.println("Enter the second Numbers");
        double number2=scan.nextDouble();

       switch (operator){
           case'+':
               System.out.println(number1+number2);
               break;
           case'-':
               System.out.println(number1-number2);
               break;
           case '/':
               System.out.println(number1/number2);
               break;
           case'*':
               System.out.println(number1*number2);
               break;
       }
       if (operator == '+'){
           System.out.println(number1+number2);
       }else if (operator == '-'){
            System.out.println(number1-number2);
        }else if(operator == '/'){
            System.out.println(number1/number2);
        }else if (operator == '*'){
            System.out.println(number1/number2);
        }else {
            System.out.println("NOT VALID");
        }



    }
}
