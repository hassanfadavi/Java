package Activities.hassan.JAVA.ASSIGNMENT_JAVA.Three_casting;

public class Question06 {
    public static void main(String[] args) {


//Question 6: Narrowing Cast with Overflow
//
//Task:
//Given a long variable bigNum = 2147483648L,
// cast it to an int and print the result.
// Explain what happens when the value exceeds the int range.

    long bigNum = 2147483648L;

     int intnumber=(int)bigNum;


        System.out.println(Integer.MIN_VALUE);

        System.out.println(intnumber);


    }
}


