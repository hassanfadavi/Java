
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.substring;

public class Question05 {
    public static void main(String[] args) {


//Question 5: Extracting Initials
//
//Task:
//Given a full name as a string, such as "John Doe", use the substring() method to
// extract the initials "J" and "D". Combine these initials to form "JD" and print the result.

        String str="John Doe";

        System.out.println(str.substring(0,1)+str.substring(5,6));

    }
}

