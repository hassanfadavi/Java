package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q46_Scanner_Calculating_Circle_Circumference {
    public static void main(String[] args) {
//        Question 46: Calculating Circle Circumference
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter the radius of a circle and store it in a double variable named radius.
//    Calculate the circumference using the formula: Circumference = 2 * Math.PI * radius.
//    Print the circumference.

        var input=new Scanner(System.in);

        double radius,Circumference;

        System.out.print("enter the radius of a circle: ");
        radius=input.nextDouble();

        Circumference = 2 * Math.PI * radius;

        System.out.println("ircumference: "+(float)Circumference);





    }
}
