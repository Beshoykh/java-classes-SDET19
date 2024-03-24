package org.example.class12march242024;

public class E1 {
    public static void main(String[] args) {
        StringBuilder st=new StringBuilder("Sunday 32");
        st.reverse();
        System.out.println(st); // explorer these classes
        st.append(" Monday");
        System.out.println(st); //to add append
        st.deleteCharAt(3);  //to delete by index
        System.out.println(st);
        st.delete(3,5);   //to delete from .... to .... Ex 3,5 (5 not included)
        System.out.println(st);


    }
}
