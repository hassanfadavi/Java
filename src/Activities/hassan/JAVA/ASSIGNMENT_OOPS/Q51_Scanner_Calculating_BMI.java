package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q51_Scanner_Calculating_BMI {
    public static void main(String[] args) {
//        Question 51: Scanner Calculating BMI
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter their weight in kilograms and height in meters. Store these values in double variables named weight and height.
//    Calculate the BMI using the formula: BMI = weight / (height * height).
//    Print the BMI.


        var input=new Scanner(System.in);

        double weight,height,BMI;

        System.out.print("enter the weight in kilograms: ");
        weight=input.nextDouble();


        System.out.print("enter the height in meters: ");
        height=input.nextDouble();

        BMI = weight / (height * height);

        System.out.println("BMI: "+(float)BMI);



    }
}
