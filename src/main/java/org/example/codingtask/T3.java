package org.example.codingtask;

public class T3 {
    public static void main(String[] args) {
        //3.	Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int[][] numbers = {{25, 98, 75, 66, 44, 32}, {10, 15, 25, 35, 50, 60}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
