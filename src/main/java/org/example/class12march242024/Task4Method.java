package org.example.class12march242024;

public class Task4Method {

   void sayHello (String whereFrom){  //so with switch

      /* if (whereFrom.equalsIgnoreCase("Egypt")){
           System.out.println("مرحبا في مصر");
       }
       else if (whereFrom.equalsIgnoreCase("Mexico")){
           System.out.println("hola en mexico");

       }
       else if (whereFrom.equalsIgnoreCase("Polish")){
           System.out.println("witam w Polsce");
       }
       else if (whereFrom.equalsIgnoreCase("Russian")){
           System.out.println("привет по русски");
       }
       else if (whereFrom.equalsIgnoreCase("Hindi")){
           System.out.println("नमस्ते हिंदी में");
       }*/
       switch (whereFrom.toLowerCase()){
           case "egypt":
               System.out.println("مرحبا في مصر");
               break;
           case "mexico":
               System.out.println("hola en mexico");
               break;
           case "polish":
               System.out.println("witam w Polsce");
               break;
           case "russian":
               System.out.println("привет по русски");
               break;
           case "hindi":
               System.out.println("नमस्ते हिंदी में");
               break;
           default:
               System.out.println("Invalid input");
       }
   }
}
