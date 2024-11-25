
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.touppercase;

public class Question07 {
    public static void main(String[] args) {


//Question 7: Checking Palindrome Ignoring Case
//
//Task:
//Given a string "Racecar", use the toUpperCase() method to
// check if the string is a palindrome, ignoring case differences.
// Print whether the string is a palindrome.

        String string="Racecar";
        System.out.println(string.toUpperCase().equalsIgnoreCase(string));

    }
}