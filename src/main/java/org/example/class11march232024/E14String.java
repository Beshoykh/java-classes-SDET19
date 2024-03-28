package org.example.class11march232024;


public class E14String {
    public static void main(String[] args) {
       // String str = new String("Java is Easy"); //original way to create
        String str1="batch 19. is good good.  good";
        String[] words=str1.split("[.]"); //split by the [.] the texts to multiple texts by index start 0
        System.out.println(words.length); //7 words in the string
        System.out.println(words[1].trim()); //to cut the space tha created before scentence index1
        // to replace old word to new word the target the old and the replacement is the new




    }
}
