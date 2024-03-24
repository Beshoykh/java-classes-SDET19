package org.example.class11march232024;

public class E1String {
    public static void main(String[] args) {
        String str = new String("Today");
        int len=str.length(); // we are call the .length method to count and store the numbers of the letters in the int ver
        System.out.println(len);
        System.out.println(str.length());  // we an use it without store in variable

        if (len>4){  //Also can be used with if or loop or any other statements
            System.out.println("Long numbers");
        }
    }
}
