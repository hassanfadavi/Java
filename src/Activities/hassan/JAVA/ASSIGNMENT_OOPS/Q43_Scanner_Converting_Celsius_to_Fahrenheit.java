package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q43_Scanner_Converting_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
//        Question 43: Converting Celsius to Fahrenheit
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter a temperature in Celsius and store it in a double variable named celsius.
//    Convert the temperature to Fahrenheit using the formula: Fahrenheit = (celsius * 9/5) + 32.
//    Print the temperature in Fahrenheit.


        var input=new Scanner(System.in);
        double celsius,convert;

        System.out.print("please enter the temperature in Celsius:");
        celsius=input.nextDouble();

        convert=(celsius * 9/5) + 32;

        System.out.println(convert+" Fahrenheit");

    }
}
