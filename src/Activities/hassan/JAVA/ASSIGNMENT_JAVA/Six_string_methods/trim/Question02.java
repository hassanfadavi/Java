package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.trim;

public class Question02 {
    public static void main(String[] args) {


//Question 2: Trimming an Already Trimmed String
//
//Task:
//Given a string "JavaProgramming", use the trim() method to verify if it
// has any effect on a string with no leading or trailing spaces. Print the result.
//
//Expected Output:
//
//JavaProgramming


        String str="JavaProgramming";
        System.out.println(str.trim().equals(str));

    }
}