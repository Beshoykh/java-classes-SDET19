package org.example.reviewclass2;

public class Rev1TypeCasting {
    public static void main(String[] args) {
       byte number=10;
       float num=number;
        System.out.println(num);

        int number1=1000000;
        short num1=(short)number1; // if the int number bigger than the new data type capacity size random number will be printed out.
        System.out.println(num1);



    }
}
