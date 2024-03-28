package org.example.class13march262024;

public class Task5 {
    int greaterNumberArray(int[] arr1) {
       int count =0;
        for (int i = 0; i <arr1.length; i++) {
            if (arr1[i]>10){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        Task5 number=new Task5();
        int [] n= {10,20,5,60,20,10,50,5};
       int count = number.greaterNumberArray(n);
        System.out.println(count);
    }

}



