package org.example.class8march102024;

public class E4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30},
        };
        for (int i=0; i<3 ; i++){
            for (int j=0; j<4; j++){
                System.out.print(numbers[i][j] + " ");    //print not println to make them in row with 2D Arrays we [row][columns]
            }
            System.out.println();     // empty println inside outer loop and outside inner loop
        }

    }
}
