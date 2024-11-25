
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.substring;

public class Question10 {
    public static void main(String[] args) {

//
//Question 10: Reconstructing a Sentence
//
//Task:
//Given the sentence "Java is fun to learn", use the substring() method
// to extract and reorder the words to form the sentence "learn to fun Java is".
// You may only use substring() and concatenation. Print the final result.

        String str="Java is fun to learn";
        System.out.println(str.substring(15)+" "+
                str.substring(12,14)+" "+
                str.substring(8,11)+" "+
                str.substring(0,4)+" "+
                str.substring(5,7));


    }
}

