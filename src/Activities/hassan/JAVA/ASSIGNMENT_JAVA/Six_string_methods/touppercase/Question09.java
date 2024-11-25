
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.touppercase;

public class Question09 {
    public static void main(String[] args) {



//Question 9: Dynamic Case Conversion
//
//Task:
//Given a string "toggle case", write logic that converts the
// string to uppercase only if it contains any lowercase letters.
// If the string is already in uppercase, print "No conversion needed". Print the final result.


        String str="toggle case";

        String result=str.toUpperCase();



        if(str.equals(result) ){
            System.out.println("No conversion needed");
        }else {
            System.out.println(str.toLowerCase());
        }



    }
}