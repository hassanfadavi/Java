

package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.length;

public class Question07 {
    public static void main(String[] args) {


//
//Question 7: Length Comparison
//
//Task:
//Create two strings: "Hello" and "world". Use the length() method to compare the lengths
// of these two strings. Then, write a statement that prints which string is longer, or if they are of equal length.
//
//Expected Outcome:
//Students should determine which string is longer and be able to articulate how they reached that conclusion.

        String str1 = "Hello";
        String str2 = "world";


        if (str1.length() == str2.length()) {
            System.out.println("they are of equal length");
        } else if (str1.length() > str2.length()) {
            System.out.println(str1 + " grater than " + str2);
        } else {
            System.out.println(str2 + " grater than " + str1);

        }


    }
}

