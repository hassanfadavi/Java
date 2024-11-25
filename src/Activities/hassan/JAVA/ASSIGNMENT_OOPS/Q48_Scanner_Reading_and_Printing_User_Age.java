package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q48_Scanner_Reading_and_Printing_User_Age {
    public static void main(String[] args) {
//        Question 48:  Reading and Printing User's Age
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter their age and store it in an int variable named age.
//    Print a message that includes the user's age (e.g., "You are 25 years old.").

        Scanner input=new Scanner(System.in);
        int age;

        System.out.println("please enter your age:");
        age=input.nextInt();

        System.out.println("you are "+age+" years old");
    }
}
