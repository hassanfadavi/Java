package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q40_Scanner_and_Printing_User_Name {
    public static void main(String[] args) {
//        Question 40: Reading and Printing User's Name
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter their first name and store it in a String variable named firstName.
//    Ask the user to enter their last name and store it in a String variable named lastName.
//    Print a greeting message that includes the user's full name (e.g., "Hello, John Doe!").

        Scanner input=new Scanner(System.in);


        String firstName,lastName;


        System.out.print("please enter your first name:");
        firstName= input.next();

        System.out.print("please enter your last name:");
        lastName= input.next();


        System.out.print("Hello,"+firstName+" "+lastName);





    }
}
