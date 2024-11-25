package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q50_Scanner_Converting_Kilometers_to_Miles {
    public static void main(String[] args) {
//        Question 50:  Converting Kilometers to Miles
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter a distance in kilometers and store it in a double variable named kilometers.
//    Convert the distance to miles using the formula: Miles = kilometers * 0.621371.
//    Print the distance in miles.

        var input=new Scanner(System.in);

        double kilometers;

        System.out.print("please enter a distance in kilometers: ");
        kilometers= input.nextDouble();

        System.out.println("distance in miles: "+(kilometers * 0.621371));






    }
}
