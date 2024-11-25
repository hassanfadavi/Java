
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.contains;

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {

//
//Question 9: Dynamic Substring Search
//
//Task:
//Given a string "The quick brown fox jumps over the lazy dog", use the contains() method to
// check if the string contains a user-defined substring.
//
//
// Assume the user provides the substring "fox".
// Print whether the substring is found.

        String message="The quick brown fox jumps over the lazy dog";

        var input=new Scanner(System.in);

        String userSubstring;

        System.out.print("enter your word: ");
        userSubstring=input.next();


         if(message.contains(userSubstring)){
             System.out.println("the substring is found");

         }else {
             System.out.println("not found");
         }





    }
}
