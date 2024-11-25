
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.trim;

public class Question08 {
    public static void main(String[] args) {


//Question 8: Trimming and Replacing
//
//Task:
//Given a string " Hello World ", use the trim() method
// to remove the leading and trailing spaces. Then, use
// the replace() method to replace all remaining spaces between
// "Hello" and "World" with a single space. Print the final result.

        String str=" Hello World ";

        String trim=str.trim();

        System.out.println(str.replace(" ",""));


    }
}