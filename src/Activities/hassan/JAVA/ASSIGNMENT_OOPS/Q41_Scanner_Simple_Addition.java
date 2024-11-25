package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q41_Scanner_Simple_Addition {
    public static void main(String[] args) {
//        Question 41: Simple Addition
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter two integers and store them in int variables named num1 and num2.
//    Calculate the sum of the two numbers.
//    Print the sum.

        var input=new Scanner(System.in);

        int num1,num2;

        System.out.print("please enter your first number:");
        num1=input.nextInt();

        System.out.print("please enter your second number:");
        num2=input.nextInt();

        System.out.println("sum is:"+(num2+num1));


    }
}
