package org.example.class11march232024;


public class E8String {
    public static void main(String[] args) {
       // String str = new String("Java is Easy"); //original way to create
        String str1="Java is Easy . HR JJDBKK fjdjd";
        int counter=0;
       // char search =str1.charAt(5);  //to get the char from the object by the index number start zero
        for (int i=0; i<str1.length(); i++){   // we an use the loop to get them all in letters
            if (str1.charAt(i)=='a' || str1.charAt(i)=='A'){
                counter++;
            }
        }            System.out.println(counter);



    }
}
