package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q52_Scanner_Adding_Three_Numbers {
    public static void main(String[] args) {
//        Question 52:  Adding Three Numbers
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter three int values and store them in variables named num1, num2, and num3.
//    Calculate the sum of the three numbers.
//    Print the sum.

        var input=new Scanner(System.in);

        int  num1, num2, num3;

        System.out.print("please enter the number1:");
        num1=input.nextInt();

        System.out.print("please enter the number2:");
        num2=input.nextInt();

        System.out.print("please enter the number3:");
        num3=input.nextInt();

        System.out.println("sum:" +(num1+num2+num3));
    }
}
