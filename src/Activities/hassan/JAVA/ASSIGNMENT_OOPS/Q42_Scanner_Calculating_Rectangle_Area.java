package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q42_Scanner_Calculating_Rectangle_Area {
    public static void main(String[] args) {
//        Question 42:  Calculating Rectangle Area
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter the length of a rectangle and store it in a double variable named length.
//    Ask the user to enter the width of the rectangle and store it in a double variable named width.
//    Calculate the area of the rectangle using the formula: Area = length * width.
//    Print the area.

        var input=new Scanner(System.in);


        double length,width,Area;

        System.out.print("please enter the length of a rectangle:");
        length=input.nextDouble();

        System.out.print("please enter the width of a rectangle:");
        width=input.nextDouble();

        Area = length * width;

        System.out.println("Area: "+Area);



    }
}
