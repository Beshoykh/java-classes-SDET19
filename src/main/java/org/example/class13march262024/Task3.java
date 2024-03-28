package org.example.class13march262024;

public class Task3 {
    char getGrade(int score) {
        if (score > 90) {
            return 'A';
        } else if (score > 80) {
            return 'B';
        } else if (score > 70) {
            return 'C';
        } else if (score > 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Task3 grade = new Task3();
       char g= grade.getGrade(95);
        System.out.println(g);
    }


}
