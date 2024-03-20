package org.example.class8march102024;

public class E6 {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30},
        };
        int sum1=0;
        for (int i=0; i<3 ; i++){
            for (int j=0; j<4; j++){
                   // System.out.print(sum1+numbers[i][j] + " ");
                    if (numbers[i][j]%2==0){
                        sum1=sum1+numbers[i][j];
                    }
            }
        }
        System.out.println(sum1);






    }
}
