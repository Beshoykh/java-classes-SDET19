package org.example.class14march272024;

public class SyntaxEmployee {

    static String ceo="samair";  //static sout without any hold in variable
    double salary;
    int emolyeeID;

    public static void main(String[] args) {
        SyntaxEmployee id1 =new SyntaxEmployee();
        id1.emolyeeID=245643;
        id1.salary=232000.23;
        System.out.println("employee id is "+id1.emolyeeID +" and the salary is "+ id1.salary +" The CEO of the company " + ceo);


        SyntaxEmployee id2 =new SyntaxEmployee();
        id2.emolyeeID=2455643;
        id2.salary=23000.23;
        System.out.println("employee id is "+id2.emolyeeID +" and the salary is "+ id2.salary +" The CEO of the company " + ceo);

    }

}
