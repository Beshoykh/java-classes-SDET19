package org.example.reviewclass4;

public class E4 {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66, 85, 100,26,89,56,33};
       // int sum1 = 0;
        int count=0;
        for (int n:numbers) {
            if (n%2==0){
               // sum1+=n;
                count++;   //use count to count the numbers of elements has been passed the condition
            }
        }System.out.println(count);




    }
}








