package org.example.class7march92024;

public class task3and4 {
    public static void main(String[] args) {
       /* String [] animals = {"Dog", "Cat", "Donkey", "Monkey" , "Tiger"};

        for (int i=0; i<5 ; i++){
            System.out.println(animals[i]);
        }

        for (String a:animals){
            System.out.println(a);
        }*/

         //Task 4
        int[] numbers={10,50,35,40,50};
         int sum=0;    // we used 0 with sum because the zero not effected any additional on numbers
        for    (int n:numbers){
            sum=sum+n;
            System.out.println(sum); //Check it again and read it carefully
        }

       /* int[] numbers2={20,50,30,70,40};
        int large=numbers2[0];   // assume that is index zero # is the larger just assume to execute the first array
        for (int k:numbers2){   // then check the index 1 which is 50 if this is the larger than 20
            if (large<k){       // then go back and index 2   3   then you find the Bigger index number of them
            large=k;}            // when the k variable which is the arrays larger than the large go to select the large is a K variable

        } System.out.println(large);// then print the large  number*/



    }
}
