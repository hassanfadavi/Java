package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q54_Scanner_Reading_Concatenating_Strings {
    public static void main(String[] args) {
//        Question 54: Scanner Reading and Concatenating Strings
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter their first name and store it in a String variable named firstName.
//    Ask the user to enter their last name and store it in a String variable named lastName.
//    Concatenate the first name and last name with a space in between.
//    Print the full name.

        Scanner input=new Scanner(System.in);

        String firstName,lastName;

        System.out.print("enter your first name:");
        firstName= input.next();

        System.out.print("enter your last name:");
        lastName= input.next();

        System.out.println(firstName+" "+lastName);

    }
}
