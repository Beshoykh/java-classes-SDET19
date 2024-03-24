package org.example.class12march242024;

public class Task1 {
    public static void main(String[] args) {
        String st= new String("This is the sentence i want to reverse");
         String []spl=st.split(" "); //use to remove the " " from the string to use word by word
         for (int i=0; i<spl.length; i++){   // we can use enhanced for loop to use word by word also
             StringBuilder s=new StringBuilder(spl[i]); //convert the loop to builder to reverse it
             s.reverse(); // to reverse the word one by one from the loop
             System.out.print(s +" ");//print out the reverse after break it word by word
         }

    }
}
