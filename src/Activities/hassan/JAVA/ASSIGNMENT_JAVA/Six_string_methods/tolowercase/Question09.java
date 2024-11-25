
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.tolowercase;

public class Question09 {
    public static void main(String[] args) {


//Question 9: Dynamic Case Conversion
//
//Task:
//Given a string "Toggle CASE", write logic that converts the string to lowercase
// only if it contains any uppercase letters. If the string is already in lowercase,
// print "No conversion needed". Print the final result.




        String str="Toggle CASE";

        String result=str.toLowerCase();



        if(str.equals(result) ){
            System.out.println("No conversion needed");
        }else {
            System.out.println(str.toLowerCase());
        }







//        if( str.equals(result)){
//            System.out.println(str.toLowerCase());
//
//        }else{
//            System.out.println("No conversion needed");
//        }




    }
}