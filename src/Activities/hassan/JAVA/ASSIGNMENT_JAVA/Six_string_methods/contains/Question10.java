
package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Six_string_methods.contains;

public class Question10 {
    public static void main(String[] args) {


//Question 10: Case-Insensitive Substring Check
//
//Task:
//Given a string "Data Mining Techniques", check if it contains the word "data" in
// a case-insensitive manner. If it does, print "Match found", otherwise print "No match found".


        String message= "Data Mining Techniques";
        String str="data";




       if(message.contains("data")) {
           System.out.println("Match found");
       }else {
           System.out.println("No match found");

       }

//       //or
//
//       if(message.toLowerCase().contains("data")){
//
//           System.out.println("Match found");
//       }else {
//           System.out.println("No match found");
//
//       }



    }
}