package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B8_Coffee_Sizes {
    public static void main(String[] args) {

//        8. Coffee Sizes:
//In a coffee shop application, customers can choose a size for their coffee:
// "Small", "Medium", "Large", or "Extra Large". Use a switch case based on a
// coffeeSize string variable to display the price of the coffee:
//
//    Small: "$2"
//    Medium: "$3"
//    Large: "$4"
//    Extra Large: "$5"
//    For any other input, display "We don't serve that size here".

        var input=new Scanner(System.in);


        String size = "";
        System.out.println("\n1: Small"+"\n"+"2: Medium"+"\n"+"3:Large"+"\n"+"4:Extra Large");
        System.out.print("select your coffeeSize: ");
        int userChoice=0;
        userChoice=input.nextInt();


        if(userChoice==1){
            size="small";
        }else if (userChoice==2){
            size="Medium";
        }else if(userChoice==3){
            size="Large";
        }else if(userChoice==4){
            size="Extra Large";
        }else System.out.println(" invalid number ");


        switch (userChoice){
            case 1:
                System.out.println(size+": $2 " );
                break;
            case 2:
                System.out.println(size+": $3 ");
                break;
            case 3:
                System.out.println(size+": $4 ");
                break;
            case 4:
                System.out.println(size+": $5 ");
                break;
            default:
                System.out.println(" We don't serve that size here ");
                break;
        }






    }
}
