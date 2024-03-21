package org.example.class9march2032024;

public class DogTester {
    public static void main(String[] args) {
     Dog dogObj1 = new Dog();
     dogObj1.name="Dog";
     dogObj1.breed="German";
     dogObj1.color="White";
     dogObj1.age=5;
     dogObj1.weight=20.0;
        System.out.println(dogObj1.name);
        System.out.println(dogObj1.breed);
        System.out.println(dogObj1.color);
        System.out.println(dogObj1.age);
        System.out.println(dogObj1.weight);
     dogObj1.bark();
        System.out.println();
    Dog dog2=new Dog();  //another dog object from the same dog class
        dog2.name="Bob";
        dog2.breed="Local";
        dog2.color="Black";
        dog2.age=5;
        dog2.weight=10.0;
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        System.out.println(dog2.weight);
        dog2.eat();
        System.out.println();






    }
}
