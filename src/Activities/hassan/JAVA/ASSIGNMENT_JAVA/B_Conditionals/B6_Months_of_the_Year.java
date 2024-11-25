package Activities.hassan.JAVA.ASSIGNMENT_JAVA.B_Conditionals;

import java.util.Scanner;

public class B6_Months_of_the_Year {
    public static void main(String[] args) {

//6. Months of the Year:
//Given an integer variable month where 1 represents January,
// 2 for February, and so on till 12 for December,
// use a switch case to display the name of the month.
// For any other value, display "Invalid month value".


        var input=new Scanner(System.in);
         int month;
        System.out.print("enter the number of the month: ");
        month=input.nextInt();

        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
               break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("invalid");


        }


    }
}
