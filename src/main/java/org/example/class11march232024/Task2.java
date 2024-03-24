package org.example.class11march232024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
      String str=new String("Empty");
      if (!str.isEmpty()){
          if (str.length()%2!=0 && str.length()>=3){
            // int middle=str.length()/2;     //to get the middle of the text
              System.out.println(str.charAt(str.length()/2));      // or this way without store in variable
          }
      }




    }
}
