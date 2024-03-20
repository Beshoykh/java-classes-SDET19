package org.example.class3feb242024;

public class Relationaloperations {
    public static void main(String[] args) {
        int num=10;
        int num2=20;
        System.out.println(num==num2); //with == we will get true and false  you can use it with number and number also statement and statement

        boolean a=true;
        boolean b=false;

        System.out.println(a==b);   //works also with boolean and char you can save the results (a==b) in boolean then run it

        char aLetter='A';
        char bLetter='a';
        boolean result=aLetter!=bLetter;   //because we used != not equal to we used boolean to store results to get the answer true or false
        System.out.println(result);

         int numA=100;
         int  numB=20;
        System.out.println(numA>numB); // use < or > greater or smaller than also we can use boolean
                                       // with <= >= will get false unless if greater or smaller or equal  but if one of them true you will get true.
        System.out.println(numA>=numB);   //true
        System.out.println(numA<=num2);   //false



    }
}
