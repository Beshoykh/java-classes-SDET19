package org.example.class13march262024;

public class Task1 {
   String emailAddress (String name, String last, String emailType){
      String full =name + last + "@" + emailType + ".com";
       return full;  //return full back to the main class to run which round trip between the method and the class
       //return the info that you want to return it back this is the way to use datatype instead of void
       //same logic of the void but we can store te return for use it again as method benefits
       //same as index of nd charAT method the return keyword make it reusable.
       //most of the time we use dataype method NOT void at all
   }
    public static void main(String[] args) {

       Task1 email=new Task1();
        String full =email.emailAddress("beshoy", "khalil", "gmail"); //we store in String because we didnt use void method because requires return
        System.out.println(full);  //in this we can add if condition or loop or anyothers to modify the method thats why prefer than void that return nothing
    }
}
