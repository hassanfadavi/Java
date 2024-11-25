package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class ACTIVITY_11_if_Favorite_Color_Picker {
    public static void main(String[] args) {

     /*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
    */

        //???????

        Scanner input=new Scanner(System.in);
        String firstColor="";
        String SecondColor="";
        String UserfavoriteColor="";



        System.out.println("enter your first color: ");
        firstColor=input.next();

        System.out.println("enter your socond clor: ");
        SecondColor=input.next();

        System.out.println("enter your favoritr color: ");
        UserfavoriteColor=input.next();

      System.out.println("your fvotite color is: "+UserfavoriteColor);
    }



}
