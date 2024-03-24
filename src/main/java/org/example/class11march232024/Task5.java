package org.example.class11march232024;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*Create a String that will hold a sentence. Write a
program to get a new String without any spaces*/
        String str="Java Is Really good and hard";
        String[] words=str.split(" "); //with array
    for (int i=0; i<words.length; i++){
        System.out.print(words[i]);
    }
        System.out.println();  //with create new STring
        String str2="Java Is Really good and hard";
        System.out.println(str2.replace(" ", ""));
    }
}
