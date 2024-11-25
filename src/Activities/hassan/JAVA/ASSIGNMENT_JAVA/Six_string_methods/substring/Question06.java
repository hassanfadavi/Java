
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.substring;

public class Question06 {
    public static void main(String[] args) {


//Question 6: Substring Puzzle
//
//Task:
//Given a string "abcdefgh", use the substring() method to rearrange the characters into the
// following order: "efghabcd". You are only allowed to use the substring() method and concatenation.
// Print the final result.


        String str="abcdefgh";

        System.out.println(str.substring(4)+str.substring(0,5));

    }
}

