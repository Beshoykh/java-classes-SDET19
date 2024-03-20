package org.example.class7march92024;

import java.util.Arrays;

public class tasknew3 {
    public static void main(String[] args) {
    char [] alpha = {'A', 'B', 'C' , 'D', 'E' , 'F'};
     for (int i= alpha.length-1; i>=0; i--){   //.length-1 to start from the end, we used this way if a lot of element
         System.out.println(alpha[i]);        // the -1 in the .length because the index start zero and the arrays start 1
     }                                      // also with this code is genaric works with any arrays that is the best  (int i= alpha.length-1; i>=0; i--)
                                            // Without the -1 will get error becaus there is an extra number in the index

     /*   char [] alpha2 = {'A', 'B', 'C' , 'D', 'E' , 'F'};
        for (int i=5; i>0 ; i--){
            System.out.println(alpha2[i]);
        }*/


    }
}
