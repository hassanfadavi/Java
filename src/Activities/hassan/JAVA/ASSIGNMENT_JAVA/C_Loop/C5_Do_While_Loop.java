package Activities.hassan.JAVA.ASSIGNMENT_JAVA.C_Loop;

import java.util.Scanner;

public class C5_Do_While_Loop {
    public static void main(String[] args) {
//        5. Do-While Loop:
//Imagine you're writing a program for an ATM.
// The user has three chances to enter the correct pin number
// .(let's assume it's "1234"). Use a do-while loop to allow the user three
// attempts to enter the pin correctly, and after three wrong attempts,
// display "Card Blocked!".

        var input = new Scanner(System.in);

        int corPass = 1234;
        int attempt=0;


        int pass;
        do {

            System.out.print("enter the pass word: ");
            pass = input.nextInt();

            if (pass == corPass) {
                System.out.println("correct");
                break;

            } else {
                System.out.println("attempt another one");

            }
            attempt++;
        }while (attempt <= 2);

        if (attempt==3){
            System.out.println("last attempt");
        }
    }
}


//do {
//        // System.out.println("Java is easy!");
//        if (numbers.length == 0) {
//        System.out.println("Array is empty, please add some values!");
//            } else {
//                    System.out.print(numbers[index] + " ");
//index++;
//        }
//        } while (index < numbers.length);



//        int number = 1;
////        do {
//            System.out.println(number);
//            number++;
//        } while (number <= 5);



