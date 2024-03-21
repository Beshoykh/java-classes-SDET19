package org.example.class9march2032024;

public class Car2Tester {
    public static void main(String[] args) {
        Car2 toyotaCar=new Car2();
        toyotaCar.make="Toyota";
        toyotaCar.model="Camry";
        toyotaCar.style="Sedan";
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

        Car2 ford=new Car2();
        ford.make="Ford";
        ford.model="Escape";
        ford.style="SUV";
        ford.year=2017;
        ford.color="Blue";
        ford.price=28500;
        System.out.println(ford.make);
        System.out.println(ford.model);
        System.out.println(ford.year);
        System.out.println(ford.color);
        System.out.println(ford.price);
        ford.moveForward();
        ford.applyBreaks();
        ford.horn();
        System.out.println(" ");

        Car2 lambo=new Car2();
        lambo.make="Lambo";
        lambo.model="SPort";
        lambo.style="Sport";
        lambo.year=2017;
        lambo.color="Blue";
        lambo.price=28500;
        System.out.println(lambo.make);
        System.out.println(lambo.model);
        System.out.println(lambo.year);
        System.out.println(lambo.color);
        System.out.println(lambo.price);
        lambo.moveForward();
        lambo.applyBreaks();
        lambo.horn();
        System.out.println(" ");
    }
}
