

package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.length;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {


//Question 5: Analyzing Length of User Input
//
//Task:
//Ask the user to input any string (you can assume a predefined string for this assignment, e.g., "OpenAI").
// Use the length() method to determine the length of the string provided by the user and print the result.
//
//Expected Outcome:
//The output should be the length of the user's input string.


       var input=new Scanner(System.in);

       String userinput;


        System.out.print("please enter your sentence: ");
        userinput=input.nextLine();

        System.out.println("count od charachter incluse space is: "+userinput.length());



    }
}