package org.example.reviewclass4;

public class E3 {

    public static void main(String[] args) {
        int[] numbers = {10, 25, 45, 66, 85, 100,10, 25, 45, 66, 85,
                100,10, 25, 45, 66, 85, 100,10, 25, 45, 66, 85, 100,10,
                25, 45, 616, 815, 100,10, 25, 45, 66, 815, 100,10, 25, 45,
                66, 815, 100,110, 25, 145, 616, 85, 100,10, 25, 45, 166, 85, 100
                ,10, 25, 45, 66, 85, 100,10, 25, 45, 66, 85, 100,110, 25, 45,
                66, 85, 100,10, 25, 45, 166, 85, 100,};
        int sum1 = 0;
        int count=0;
        for (int n:numbers) {
            if (n>25){
                sum1+=n;
                count++;   //use count to count the numbers of elements has been passed the condition
            }
        }System.out.println(sum1/count);



    }
}








