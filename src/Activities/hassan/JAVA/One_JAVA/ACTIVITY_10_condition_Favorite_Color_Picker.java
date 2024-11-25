package Activities.hassan.JAVA.One_JAVA;

public class ACTIVITY_10_condition_Favorite_Color_Picker {


    public static void main(String[] args) {

        /*
    Question: Favorite Color Picker

    You have two color options: String color1 = "Red"; and String color2 = "Blue";.
    You like the color "Red" more than "Blue".
    Using the conditional operator, determine which color is your favorite.
    Store your favorite color in a variable called favoriteColor.
    Print out your favorite color. What is the color?
    */



       String color1,color2;
       color1="red";
       color2="blue";
       String favoriteColor;

       favoriteColor=(color1.equals("red")) ? color1:color2;
        System.out.println("my favorite color is :" +favoriteColor);


    }
}
