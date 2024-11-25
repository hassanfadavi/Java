
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.tolowercase;

public class Question08 {
    public static void main(String[] args) {


//Question 8: Case-Insensitive Substring Check
//
//Task:
//Given two strings "Hello World" and "world", use the toLowerCase()
// method to check if the second string is a substring of the first string, ignoring case. Print the result.

       String  strings= "Hello World";
      String str="world";

      if(str.equalsIgnoreCase(strings.substring(6)))
        {
            System.out.println(str.toLowerCase());

        }






    }
}