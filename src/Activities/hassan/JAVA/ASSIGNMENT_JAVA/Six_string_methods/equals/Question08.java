

package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.equals;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {


//
//Question 8: Dynamic String Comparison
//
//Task:
//Given a string "OpenAI" and a user-defined input string
// (assume the user enters "openai"), use the equals() method to check if
//  the strings are exactly equal. If they are not, print "Strings do not match exactly".
//

        Scanner input=new Scanner(System.in);

        String userinput;
//

        System.out.print("please enter openai:");
        userinput=input.next();
//
        if(userinput.equals("OpenAI")) {
            System.out.println("Strings matches exactly");
        }else{
            System.out.println("Strings do not matches exactly");
            }
        }

//  regardless of casesensitive
//        if(userinput.equalsIgnoreCase("OpenAI")) {
//        System.out.print("Strings matches exactly");
//    }else{
//        System.out.println("Strings do not matches exactly");
//    }
}






