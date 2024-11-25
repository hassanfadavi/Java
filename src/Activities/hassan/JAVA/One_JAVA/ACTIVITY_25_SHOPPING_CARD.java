package Activities.hassan.JAVA.One_JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class ACTIVITY_25_SHOPPING_CARD {
    public static void main(String[] args) {


            /*
Shopping Cart:

Objective: Store the prices of items in a shopping cart and calculate the total cost.

    Question:
    You have an array to store the prices of 10 items in a shopping cart.
     After storing the prices, how would you calculate
    and print the total cost of all items in the cart?

    NOTE: Use scanner!
    Print the highest item price and the lowest item price as well!



*/     var input=new Scanner(System.in);




     double[]price=new double[10];
     double totalcost;

        System.out.print("enter the price of item 1:");
        price[0]=input.nextInt();
        System.out.print("enter the price of item 2:");
        price[1]=input.nextInt();
        System.out.print("enter the price of item 3:");
        price[2]=input.nextInt();
        System.out.print("enter the price of item 4:");
        price[3]=input.nextInt();
        System.out.print("enter the price of item 5:");
        price[4]=input.nextInt();
        System.out.print("enter the price of item 6:");
        price[5]=input.nextInt();
        System.out.print("enter the price of item 7:");
        price[6]=input.nextInt();
        System.out.print("enter the price of item 8:");
        price[7]=input.nextInt();
        System.out.print("enter the price of item 9:");
        price[8]=input.nextInt();
        System.out.print("enter the price of item 10: ");
        price[9]=input.nextInt();


        totalcost=(price[0]+price[1]+price[3]+price[4]+price[5]+price[6]+price[7]+price[8]
                +price[9]);

        System.out.println("total cost is :" + totalcost);



        Arrays.sort(price);
        System.out.println("cheapest item is: " +price[0]);
        System.out.println("highest item is: " +price[9]);

        System.out.println(Arrays.toString(price));







    }
}
