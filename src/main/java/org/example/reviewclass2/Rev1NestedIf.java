package org.example.reviewclass2;

public class Rev1NestedIf {
    public static void main(String[] args) {
       boolean havecoupon=true; // play with this task
        int coupon=30;
        System.out.println(1);
        if (havecoupon){
            System.out.println(2);
            if (coupon==10){
                System.out.println(3);}
            else if (coupon==20){
                System.out.println(4);}
            else{
                System.out.println(5);}

        }
        System.out.println(6);
        System.out.println(7);
    }

    }

