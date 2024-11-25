package hassan.ASSIGNMENT;

public class Q57_equal {
    public static void main(String[] args) {
//        Question 3: Problem Statement:
//Given two strings, " Java" and "Java ", write a Java program that trims both strings and then checks if they are equal after trimming. Print "Equal" if they are the same, otherwise print "Not Equal".
//
//Expected Output: Equal

        String trim1=" Java".trim();
        String trim2="Java ".trim();

//        System.out.println(trim1);
//        System.out.println(trim2);
//
        boolean result;

        result=(trim1.equals(trim2)) ? true:false;
        if(true) System.out.println("equal");
        else System.out.println("not equal");






    }
}
