package org.example.class10march2032024;

public class BankUserTester {
    public static void main(String[] args) {
        BankUser person1=new BankUser();
        person1.firstName="Beshoy";
        person1.lastName="Khalil";
        person1.address="1255 main ave";
        person1.mailingAddress="1255 main ave";
        person1.age=36;
        person1.salary=360000;
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println(person1.address);
        System.out.println(person1.mailingAddress);
        System.out.println(person1.age);
        System.out.println(person1.salary);

        person1.takingLoan();
        person1.deposit();
        person1.cashOut();
        System.out.println();



    }
}
