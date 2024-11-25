package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Five_operatoprecedence;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {


//Question 10: Complex Expression with Scanner Input
//
//Task:
//Write a program that asks the user for two integers using the Scanner class.
// Then, calculate and print the result of the expression:
// (firstNumber + secondNumber) * firstNumber / secondNumber + 2.
// Explain how the precedence rules are applied in this expression.
//
//Sample Input:
//
//Enter first number: 4
//Enter second number: 2
//
//Expected Output:
//
//Result: 12 (should be changed to 14)

        Scanner input=new Scanner(System.in);


       int number1;
        System.out.print("enter first number: ");
       number1=input.nextInt();


       int number2;
        System.out.print("enter second number: ");
       number2=input.nextInt();

       int result=((number1 + number2) * number1 / number2 + 2);

        System.out.print(result);








    }
}