package org.example.class7march92024;

public class tasknew2 {
    public static void main(String[] args) {
     /* int [] numbers={500,54,52,55,25,25,2};
      int sum=0;
      for (int n:numbers){
          sum=sum+n;
          System.out.println(sum);
      }*/
       int [] numbers={500,54,52,55,25,2500,2};
        int large=0;
        for (int n:numbers){
            if (large<n){
                large=n;
            }
        }                System.out.println(large);



    }
}
