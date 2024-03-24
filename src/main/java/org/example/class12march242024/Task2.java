package org.example.class12march242024;

public class Task2 {
    public static void main(String[] args) { //we need to keep both String or both Str Builders not one and one.
        String s="civic";  //create a variable that you need to reverse
        StringBuilder st= new StringBuilder(s);  //use builder to reverse it
        st.reverse();  //reverse it
        String reversed=st.toString(); //use req string to store the reverse word
      if (s.equalsIgnoreCase(reversed)){ //use if condition to compare the reverse and the original
          System.out.println("True");
      }else{
          System.out.println("False");
      }
    }
}
