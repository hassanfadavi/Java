package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.replace;

public class Question09 {
    public static void main(String[] args) {

//
//
//Question 9: Handling Multiple Replacements
//
//Task:
//Given a string "Java, Java, Java", replace only the second occurrence of "Java" with "Python".
// Print the final result.

        String str="Java, Java, Java";

        String str1=str.replaceFirst("Java","Python");

        String str2=str1.replaceFirst("Java","Python");
        System.out.println(str2.replaceFirst("Python","Java"));


        //or

//        System.out.println(str.replace("Java, Java, Java","Java,  Python , Java") );

    }
}