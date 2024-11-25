
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.trim;

public class Question07 {
    public static void main(String[] args) {


//Question 7: Combining trim() with Length Check
//
//Task:
//Given a string " OpenAI ", use the trim() method and then check if
// the length of the trimmed string is greater than 5. Print whether the condition is true or false.



        String string= " OpenAI ";



        if(string.trim().length()==5){
            System.out.println(true);

        }else {
            System.out.println(false);
        }
        System.out.println(string.trim().length());
    }
}