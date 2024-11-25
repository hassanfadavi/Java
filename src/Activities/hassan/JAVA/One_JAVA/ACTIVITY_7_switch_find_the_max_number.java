package Activities.hassan.JAVA.One_JAVA;

 import java.util.Scanner;

public class ACTIVITY_7_switch_find_the_max_number {
    public static void main(String[] args) {



        // Try to find the bigger number among two numbers using switch statement!


//        Scanner input = new Scanner(System.in);

        Scanner input=new Scanner(System.in);



        int numberOne ;
        int numberTwo;
        System.out.println("enter the number one:");
        numberOne=input.nextInt();

        System.out.println("enter the numbertwo:");
        numberTwo=input.nextInt();


        int compareResult;

        if (numberOne > numberTwo) compareResult = 1;
        else if (numberOne < numberTwo) compareResult = 2;
        else compareResult=0;



        switch (compareResult) {
            case 1:
                System.out.println(numberOne + "is bigger than " + numberTwo);
                break;
            case 2:
                System.out.println(numberOne + "is smaller than" + numberTwo);
                break;
            default:
                System.out.println("they are equal");
        }

    }
}








//
//        int numOne, numTwo;
//
//        System.out.println("input numOne");
//        numOne = input.nextInt();
//
//
//        System.out.println("input number two");
//        numTwo = input.nextInt();
//
//        switch (input) {
//            case numOne:
//                System.out.println("number one");
//            case numTwo:
//                System.out.println("number two");
//
//        }
