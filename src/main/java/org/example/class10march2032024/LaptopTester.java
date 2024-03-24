package org.example.class10march2032024;

public class LaptopTester {
    public static void main(String[] args) {
        Laptop dell=new Laptop();
        dell.make="Dell";
        dell.model="D300";
        dell.screenSize=17;
        dell.ramSize=32;
        dell.processor="I7";
        dell.price=1200;
        System.out.println(dell.make);
        System.out.println(dell.model);
        System.out.println(dell.screenSize);
        System.out.println(dell.ramSize);
        System.out.println(dell.processor);
        System.out.println(dell.price);
        dell.gaming();
        dell.onlineService();
        dell.recordVideo();
        dell.touchScreen();
        dell.writeTexts();


    }
}
