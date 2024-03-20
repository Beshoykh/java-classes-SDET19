package org.example.class8march102024;

public class E1 {
    public static void main(String[] args) {
        String [] names ={"James" , "Iram" , "Feb" , "Aladin" , "Ana" , "Silvia" , "Beshoy", "Matt"};
           String name="Beshoy";  //The name to search
        for (String n:names){     // enhanced for loop with arrays
            if (n.equals(name)){   // here we if stat if the name stored in String up match or not
                System.out.println(n + " Is present");
                break;  // break to stop the loop right away after found the match condition always use break with loop
                        // only one break in the end of the loop
                        // why? to save us a lot of unnessery processing, stop looping once goal reached
            }


            /* Break keyword:
    Break keyword breaks the loop. We always use Break keyword
    with if conditions once the condition is met it stops the
    loop even if there are still iterations remaining.
Why should we use Break:
    If we ue Break we can save a lot of unnecessary processing
    by terminating the loop once the goal is complete.
Continue:
    Continue keyword is used to skip unnecessary calculations.
    if an element meets a condition that element is skipped and
    we move to the next element.
Why should we use?
    To save resources to avid unnecessary calculations.
Note:
    Break and continue keyword are always written with if
    conditions inside the loop.*/
        }

    }
}
