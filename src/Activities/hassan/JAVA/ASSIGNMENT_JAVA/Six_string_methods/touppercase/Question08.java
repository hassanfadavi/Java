
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.touppercase;

public class Question08 {
    public static void main(String[] args) {


//Question 8: Case-Insensitive Substring Check
//
//Task:
//Given two strings "hello world" and "WORLD",
// use the toUpperCase() method to check if the second string is a
// substring of the first string, ignoring case. Print the result.



        String  strings= "hello world";
        String str="WORLD";

        if(str.equalsIgnoreCase(strings.substring(6)))
        {
            System.out.println(str.toUpperCase());

        }


    }
}