package org.example.class13march262024;

public class Task4 {
    int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
                 //go through this task agian and again
    public static void main(String[] args) {
        Task4 task4=new Task4();
       int [] ar={10,20,30};
       int result=task4.sumArray(ar);
        System.out.println(result);
    }


}



