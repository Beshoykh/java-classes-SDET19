package org.example.class14march272024;

public class STudents {

    String name;
    int id;
   static int numberOfStudent=1;  //to need something counting up use static and ++ we used it with (class name.) not with the (object.)

    public static void main(String[] args) {
        STudents st1=new STudents();
        st1.name="Bob";
        st1.id=254587;
        System.out.println("The Student name is "+ st1.name+ " the ID # is "+ st1.id+ " the number of student is "+ STudents.numberOfStudent++);
        STudents st2=new STudents();
        st2.name="Han";
        st2.id=288887;
        System.out.println("The Student name is "+ st2.name+ " the ID # is "+ st2.id+ " the number of student is "+ STudents.numberOfStudent++);
        STudents st3=new STudents();
        st3.name="ENJ";
        st3.id=256687;
        System.out.println("The Student name is "+ st3.name+ " the ID # is "+ st3.id+ " the number of student is "+ STudents.numberOfStudent++);
    }
}
