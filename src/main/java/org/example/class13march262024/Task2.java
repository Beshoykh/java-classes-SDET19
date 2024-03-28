package org.example.class13march262024;

public class Task2 {
   boolean Prime (int number){
     /* if (number<=1){
          return false;
      }*/
       int count=0;
       for (int i=1; i<=number; i++){
           if (number%i==0){
               count++;
           }
       }
       if (count==2){
           System.out.println("Prime");
       } else{
           System.out.println("Not Prime");
       }
       return false;
   }
    public static void main(String[] args) {
        Task2 primeNUmber=new Task2();
        boolean n=primeNUmber.Prime(21);
    }
}
