package org.example.class7march92024;

import java.util.Arrays;

public class E2 {
    public static void main(String[] args) { // 2nd way to Arrays
      int [] ages= {10,20,25,45,23};
        System.out.println(ages[3]);
        // Index started with ZERO

         char [] grades= {'A', 'B' , 'C', 'D', 'C'}; //always with char use ' '
        System.out.println(grades[3]);
        System.out.println((grades[1] + " " + grades[3])); // to print 2 or more in same line

        //2nd way for the example above

        char[] grades2 = new char[4]; // in this way you should make sure you have at least the same # of [4] and the index start from ZERO
        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        System.out.println(Arrays.toString(grades2));





    }
}
