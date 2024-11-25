package hassan.ASSIGNMENT;

import java.util.Scanner;

public class Q44_Scanner_Reading_and_Printing_a_Sentence {
    public static void main(String[] args) {
//        Question 44:  Reading and Printing a Sentence
//
//    Create a Scanner object to read input from the user.
//    Ask the user to enter a sentence and store it in a String variable named sentence.
//    Print the sentence back to the user.


        var input=new Scanner(System.in);

        String sentence;

        System.out.print("plese enter a sentence: ");
        sentence=input.nextLine();

        System.out.println(sentence);



    }
}
