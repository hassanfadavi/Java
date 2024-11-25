package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q47_Scanner_Dividing_Two_Numbers {
    public static void main(String[] args) {
//        Question 47: Dividing Two Numbers
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter two double values and store them in variables named num1 and num2.
//    Calculate the result of dividing num1 by num2.
//    Print the result.

        var input=new Scanner(System.in);

        double num1,num2,result;

        System.out.print("please enter  number 1: ");
        num1=input.nextDouble();

        System.out.print("please enter  number 2: ");
        num2=input.nextDouble();

        result=num1/num2;

        System.out.println("result of dividing is: "+(float)result);



    }
}
