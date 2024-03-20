package org.example.class7march92024;

import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {
      /*  String [] names = new String[50];
        names[5]="Beshoy";
        names[10]="Meme";
        names[15]="Anthony";   //first way to creat Arrays
        names[34]="Austin";
        System.out.println(names[10]);
       // System.out.println(Arrays.toString(names)); */

       int [] numbers={1,50,60,87,650,565};
       int large=numbers[0];
       for (int n:numbers){
           if (large<n){
               large=n;
           }
       }
        System.out.println(large);

    }
}