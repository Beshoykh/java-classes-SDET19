package org.example.class4feb252024;

public class NestedIf {
    public static void main(String[] args) {
        boolean mainDoor = true;
        boolean room1 = true;
        boolean room2 = false;
        if (mainDoor) {    //open 2 curly brackets and put spaces to create the 2nd if and all the same
            if (room1) {
                System.out.println("Room 1 is open");
            } else {
                System.out.println("Room 1 is closed");
            }
            if (room2){   //room 2 closed because is boolean room 2 false
                System.out.println("Room 2 is open");
            }else {
                System.out.println("Room 2 is closed");
            }
        } else {
            System.out.println("main door is closed");
        }


    }
}

