package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B4_Ternary_Operator {
    public static void main(String[] args) {

//        4. Ternary Operator:
//In an online store, if a user is a member,
// they get a 10% discount.
// Given the original price of an item and a boolean isMember,
// calculate and display the final price using the ternary operator.


        double itemPrice;
        boolean isMember=false;

        var input=new Scanner(System.in);

        System.out.print("enter the price: ");
        itemPrice=input.nextDouble();



        System.out.print("are you member: ");
        System.out.println("select 1:yes   or   2:no");



        int userChoice;
        userChoice=input.nextInt();
        if(userChoice==1){
            isMember=true;
        }else if(userChoice==2){
            isMember=false;
        }else System.out.println("invalid choice");

        if(isMember   ){
            System.out.println("totall price include 10% disscunt  : "+ itemPrice*0.9);
        }else
        System.out.println("totall price is: "+itemPrice);




    }
}
