package org.example.class11march232024;


public class E13String {
    public static void main(String[] args) {
       // String str = new String("Java is Easy"); //original way to create
        String str1="batch 19 is good good  good";
        String[] words=str1.split(" "); //split by the spaces the texts to multiple texts by index start 0
        System.out.println(words.length); //7 words in the string
        System.out.println(words[3]);
        for (int i=0; i<words.length; i++){
            System.out.print(words[i]+" ");
        }
        // to replace old word to new word the target the old and the replacement is the new




    }
}
