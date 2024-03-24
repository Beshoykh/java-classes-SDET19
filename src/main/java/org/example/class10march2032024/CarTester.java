package org.example.class10march2032024;

public class CarTester {

    public static void main(String[] args) {
        Car toyotaCar=new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Camry";
        toyotaCar.year=2022;
        toyotaCar.color="Blue";
        toyotaCar.price=32000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.color);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBreaks();
        toyotaCar.horn();
        System.out.println();

        Car fordF150=new Car();
        fordF150.make="Ford";
        fordF150.model="F150";
        fordF150.year=2017;
        fordF150.color="Blue";
        fordF150.price=28500;
        System.out.println(fordF150.make);
        System.out.println(fordF150.model);
        System.out.println(fordF150.year);
        System.out.println(fordF150.color);
        System.out.println(fordF150.price);
        fordF150.moveForward();
        fordF150.applyBreaks();
        fordF150.horn();
        System.out.println("FOR SALE WITH DISCOUNT FOR THIS CAMP");





    }


}
