
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.tolowercase;

public class Question10QQQQ {
    public static void main(String[] args) {


//Question 10: Complex Case Manipulation
//
//Task:
//Given a string "aBcDeFgHiJ", convert the string to lowercase.
// Then, replace every third character in the string with "*". Print the final result.


        String str="aBcDeFgHiJ";



        System.out.println(str.toLowerCase().replace(str.substring(2,3),"*"));

    }
}