package Activities.hassan.JAVA.One_JAVA;

import java.util.Scanner;

public class caculator {
    public static void main(String[] args) {


//        List<Integer> listOfOperators = new ArrayList<>();
        var input = new Scanner(System.in);


        int choiceOperator = 0;


        double numberOne;
        System.out.print("enter number one: ");
        numberOne = input.nextDouble();


        System.out.println("* * * * * * * * * * Enter the operator * * * * * * * * * *");
        System.out.println("1: Minus Key: [-] ");
        System.out.println("2: Plus Key: [+] ");
        System.out.println("3: Multipilication Key: [*] ");
        System.out.println("4: Devision Key: [/] ");


        System.out.print("choice operator: ");
        choiceOperator = input.nextInt();


        double anotherNumber;
        System.out.print("enter number Two: ");
        anotherNumber = input.nextDouble();


//        boolean addmore = true;
//        while (addmore) {
//        System.out.print("Do you want add another operator (yes / no): ");
//        String userInput = input.next();
//        if (userInput.equals("yes")) {
//
////            numberOne=result;
//            addmore = true;
//        } else {
//            addmore = false;
//        }


//        break;


//            anotherNumber = input.nextInt();




        boolean addmore = true;
        while (addmore) {
            switch (choiceOperator) {
                case 1:

                    double result = numberOne - anotherNumber;
                    System.out.print("Do you want add another operator (yes / no): ");
                    String userInput = input.next();
                    if (userInput.equals("yes")) {
                        addmore=true;
//                        numberOne = result;
                    } else {
                        addmore = false;
                    }
            }
        }

    }
}

//
//
//                        System.out.println("numberOne - anotherNumber= " + result);
//
//
//
//
//                    }
//
//                    break;
//
//                case 2:
//                     result = numberOne + anotherNumber;
//                    System.out.println("numberOne + anotherNumber= " + result);
//                    break;
//
//                case 3:
//                     result = numberOne * anotherNumber;
//                    System.out.println("numberOne * anotherNumber= " + result);
//                    break;
//
//                case 4:
//                     result = numberOne / anotherNumber;
//                    System.out.println("numberOne / anotherNumber: " + result);
//                    break;
//                case 5:
//
//
//
//                default:
//                    System.out.println("invalid operator");
//
//            }
//
//
//        }
//    }
//
//





























//        var input=new Scanner(System.in);
//
//        int numbernumber;
//        System.out.print("enter number one: ");
//        numbernumber=input.nextInt();
//
//        int numberanotherNumber;
//        System.out.print("enter number Two: ");
//        numberanotherNumber=input.nextInt();
//
//        int compareResult;
//
//        if(numbernumber>numberanotherNumber) {
//
//            compareResult = 1;
//
//        }else if(numbernumber<numberanotherNumber) {
//
//            compareResult = 2;
//        }else {
//            compareResult=0;
//        }
//
//        switch (compareResult){
//
//            case 1:
//                int result1=numberanotherNumber*numbernumber;
//                System.out.println("bigger number is number one:"+numbernumber+"so numberanotherNumber*numbernumber: "+result1);
//                break;
//            case 2:
//                double result2=numberanotherNumber/numbernumber;
//                System.out.println("bigger number is number Two: "+numberanotherNumber+"so numberanotherNumber/numbernumber: "+result2);
//                break;
//
//            default :
//                System.out.println("equal");
//
//        }





//        var inputDays=new Scanner(System.in);
//
//        System.out.println("enter numbers day: ");
//        int userInput;
//        userInput=inputDays.nextInt();
//
//
//        switch (userInput) {
//
//            case (1):
//                System.out.println("saturday");
//                break;
//
//            case (2):
//                System.out.println("sunday");
//                break;
//            case (3):
//                System.out.println("monday");
//                break;
//            case (4):
//                System.out.println("tuesday");
//                break;
//            case (5):
//                System.out.println("wednedsay");
//                break;
//            case (6):
//                System.out.println("thursday");
//                break;
//            case (7):
//                System.out.println("friday");
//                break;
//
//            default:
//                System.out.println("invalid number");
//
//        }









