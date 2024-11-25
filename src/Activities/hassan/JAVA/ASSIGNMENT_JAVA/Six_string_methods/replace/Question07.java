
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.replace;

public class Question07 {
    public static void main(String[] args) {


//
//Question 7: Conditional Replacement
//
//Task:
//Given a string "The quick brown fox jumps over the lazy dog",
// replace the word "quick" with "slow" only if the string contains the word "fox". Print the result.


        String srt="The quick brown fox jumps over the lazy dog";

        if(srt.contains("fox")){
            System.out.println(srt.replace("quick","slow"));
         } else{
            System.out.println("no fox");

        }




    }
}