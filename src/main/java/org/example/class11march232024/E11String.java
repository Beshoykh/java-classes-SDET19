package org.example.class11march232024;


public class E11String {
    public static void main(String[] args) {
       // String str = new String("Java is Easy"); //original way to create
        String str1="42aczb5135dgv12xdsff231d3avcbscv213v";
        System.out.println(str1.replaceAll("[0-4]", "*"));
        System.out.println(str1.replaceAll("[a-c]", ""));//remove because the replacement empty
        System.out.println(str1.replaceAll("[a-c0-9]", "*"));//to accept more than condition inside the operator
        System.out.println(str1.replaceAll("[^a-c0-9]", "*"));// oppsite th above one will keep^ = !
        // to replace all specific type of pattern to new thing the regex the old and the replacement is the new




    }
}
