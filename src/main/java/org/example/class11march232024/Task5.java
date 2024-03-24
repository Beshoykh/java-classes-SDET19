package org.example.class11march232024;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/*Create a String that will hold a sentence. Write a
program to get a new String without any spaces*/
        String str="Java Is Really good and hard";
        String[] words=str.split(" ");
    for (int i=0; i<words.length; i++){
        System.out.print(words[i]);
    }
    }
}
