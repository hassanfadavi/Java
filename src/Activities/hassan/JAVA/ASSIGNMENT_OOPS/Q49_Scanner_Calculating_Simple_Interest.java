package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q49_Scanner_Calculating_Simple_Interest {
    public static void main(String[] args) {
//        Question 49:Scanner Calculating Simple Interest
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter the principal amount, rate of interest, and time in years. Store these values in double variables named principal, rate, and time.
//    Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
//    Print the simple interest.

        var input=new Scanner(System.in);

        double principal, rate, time;

        System.out.print("please enter the principal amount:");
        principal=input.nextDouble();

        System.out.print("please enter the rate:");
        rate=input.nextDouble();

        System.out.print("please enter the time:");
        time=input.nextDouble();


        System.out.print("simple interest is: "+((principal * rate * time) / 100));




    }
}
