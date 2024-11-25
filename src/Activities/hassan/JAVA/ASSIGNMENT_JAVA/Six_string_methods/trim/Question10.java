
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.trim;

public class Question10 {
    public static void main(String[] args) {


//Question 10: Trimming in a Sentence
//
//Task:
//Given a sentence where each word is surrounded by spaces,
// such as " Java is awesome ", use the trim() method in combination
// with the replace() method to ensure each word is properly spaced with only
// one space between words. Print the final result.

        String str=" Java  is    awesome ";



        System.out.println(str.trim().replaceAll("\\s+"," "));



    }
}