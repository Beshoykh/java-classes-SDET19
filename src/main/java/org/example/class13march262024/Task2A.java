package org.example.class13march262024;

public class Task2A {
    boolean isPrime(int n){

        if(n<=1){
            return false;
        }else if(n==2||n==3){
            return true;
        }
        for (int i = 4; i <n ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    }

