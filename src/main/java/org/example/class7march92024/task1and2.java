package org.example.class7march92024;

public class task1and2 {
    public static void main(String[] args) {
        String [] names = {"Matt", "Youstina", "Lana", "Dina" , "Beshoy", "Kira", "Hadia", "Febricio", "Ayushma", "Michelle" };
        System.out.println(names[4]);      // Task 1 Arrays way 1


        // Task 1 Arrays way 2
        String[] names2= new String[10];
        names2[0]="Matt";
        names2[1]="Youstina";
        names2[2]="Dina";
        names2[3]="Beshoy";
        names2[4]="Kira";
        names2[5]="Hadia";
        names2[6]="Febricio";
        names2[7]="Ayushma";
        names2[9]="Michelle";
        System.out.println((names2[3])); //Ayyays.toString methods put the output in [   ]

       //Task 2

        String [] words= {"Java", "Saturday", "day", "Coding", "is"};
        System.out.println(words[1] +" " + words[4] + " " +words[0] + " " + words[3] + " " +words[2]);


    }
}
