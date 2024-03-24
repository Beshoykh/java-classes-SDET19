package org.example.class12march242024;

public class Method3 {
    void palindrome (String word1){
        StringBuilder strPalindrrome= new StringBuilder(word1);
        strPalindrrome.reverse();
        String reversed = strPalindrrome.toString();
        if (word1.equals(reversed)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
