
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.length;

public class Question09 {
    public static void main(String[] args) {


//Question 9: Counting Specific Characters
//
//Task:
//Given a string like "abracadabra", count how many times a specific character (e.g., "a")
// appears in the string. Use the length() method indirectly by comparing the length of the string
// before and after removing all occurrences of the character "a". Explain the logic behind your approach.
//
//Expected Outcome:
//Students will need to think about how to use string methods together creatively,
// even though they haven't formally studied loops or advanced methods yet.

        String Str1= "abracadabra";

        int count=0;

        for(int i=0;i<Str1.length();i++){

           if( Str1.charAt(i)=='a' ) {
               count++;
           }
        }
        System.out.println(count);




    }
}