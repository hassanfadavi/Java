package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.substring;

public class Question07 {
    public static void main(String[] args) {


//Question 7: Conditional Substring Extraction
//
//Task:
//Given a string that might vary in length, such as "WelcomeToJavaProgramming",
// write a condition that extracts the first half of the string if its length is even,
// or the first three characters if its length is odd. Use the substring() method and print the result.

        String message = "WelcomeToJavaProgramming";

        int msg = message.length();

        System.out.println(message.length());
        if (msg % 2 == 0) {
            System.out.println(message.substring(0,(msg / 2)));
        } else {
            System.out.println(message.substring(0, 3));

        }

    }


}


