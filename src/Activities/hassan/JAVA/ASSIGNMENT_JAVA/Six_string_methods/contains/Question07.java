
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.contains;

public class Question07 {
    public static void main(String[] args) {



//Question 7: Multiple Substring Check
//
//Task:
//Given a string "Machine Learning with Python", use the contains() method to check
//if the string contains both "Machine" and "Python". Print true if both substrings are found, otherwise print false.



        String message="Machine Learning with Python";


        if(message.contains("Machine")&& message.contains("Python")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



}
}