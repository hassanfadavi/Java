package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.charat;

public class Question08_okokokokok {
    public static void main(String[] args) {


//
//Question 8: Counting Specific Characters
//
//Task:
//Given a string "Mississippi", use the charAt() method to count how
//many times the character "s" appears in the string. Print the total count.


        String name= "Mississippi";

        char cha='s';
        int count=0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==cha){
                count++;


            }
        }
        System.out.println(count);







}
}