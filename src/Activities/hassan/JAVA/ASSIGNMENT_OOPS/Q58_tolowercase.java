package hassan.ASSIGNMENT;

public class Q58_tolowercase {
    public static void main(String[] args) {
//        Question 4: Problem Statement:
//Create a Java program that trims the string " ERROR ", converts it to lowercase, and then replaces 'error' with 'warning'. Print the final string.
//
//Expected Output: warning


//        String name=" ERROR ";
//        name.toLowerCase();
//        name.toLowerCase();
//        name.replaceAll("error","Warning");
//
        String name=" ERROR ";

        String result=name.trim().toLowerCase().replaceAll("error","Warning");

//        name.replaceAll("error","Warning");

        System.out.println(result );
    }
}
