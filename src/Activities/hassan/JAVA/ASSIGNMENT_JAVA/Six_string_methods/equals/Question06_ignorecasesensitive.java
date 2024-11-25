

package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.equals;

public class Question06_ignorecasesensitive {
    public static void main(String[] args) {

//
//Question 6: Case-Insensitive Comparison
//
//Task:
//Given two strings, "Java Programming" and "java programming", write logic that
// compares them for equality ignoring case. Print whether they are considered equal.

        String  str1="Java Programming";
        String  str2="java programming";



        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


    }
}