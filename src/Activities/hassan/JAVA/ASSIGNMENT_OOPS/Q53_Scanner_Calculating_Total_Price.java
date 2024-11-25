package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q53_Scanner_Calculating_Total_Price {
    public static void main(String[] args) {
//        Question 53:Scanner Calculating Total Price
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter the quantity of items and the price per item. Store these values in int and double variables named quantity and pricePerItem.
//    Calculate the total price by multiplying quantity with pricePerItem.
//    Print the total price.

        var input=new Scanner(System.in);


        double quantity,pricePerItem;

        System.out.print("please enter the quantity of items: ");
        quantity=input.nextDouble();

        System.out.print("please enter the price per item: ");
        pricePerItem=input.nextDouble();

        System.out.println("total price is: "+(quantity*pricePerItem));

    }
}
