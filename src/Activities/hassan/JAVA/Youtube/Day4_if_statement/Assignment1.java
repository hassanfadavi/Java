package Activities.hassan.JAVA.Youtube.Day4_if_statement;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        //smallest of 3 numbers
        //if else

        var input = new Scanner(System.in);
        int numOne;
        int numTwo;
        int numThree;

        System.out.print("enter num one:");
        numOne = input.nextInt();

        System.out.print("enter num Two:");
        numTwo = input.nextInt();

        System.out.print("enter num Three:");
        numThree = input.nextInt();


//        if(numOne<=numTwo && numOne<=numThree){
//            System.out.println("number 1 is smallest");
//        } else if (numOne>=numTwo && numTwo<=numThree) {
//            System.out.println("number 2 is smallest");
//        }else System.out.println("num 3 is smallest");
//


        //or

              String smallest=  (numOne <= numTwo && numOne <= numThree) ? "number 1 is smallest" :
                        (numOne >= numTwo && numTwo <= numThree) ? "number 2 is smallest" :
                                "number 3 is smallest";

        System.out.println(smallest);




    }

}