package org.example.class11march232024;

public class Task6 {
    public static void main(String[] args) {
/*Create a String that should be combination of letters,
numbers and special characters. Find out how many Alphabets(abd AZ)
 characters are there in the String.*/

        String str="gDhsdfjad&D^%D^*oD543543";
        System.out.println(str.replaceAll("[^a-zA-Z]","").length());

    }
}
