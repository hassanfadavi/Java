
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.contains;

public class Question08 {
    public static void main(String[] args) {


//Question 8: Checking for a Substring in User Input
//
//Task:
//Assume you have a string representing user input, "I love programming in Java".
// Use the contains() method to check if the input contains the word "Java". If it does,
// print a message saying "User is interested in Java". If not, print "User is interested in something else".
//


        String message="I love programming in Java";

        if(message.contains("Java")){
            System.out.println("User is interested in Java");
        }else {
            System.out.println("User is interested in something else");
        }

 }
 }