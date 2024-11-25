package hassan.ASSIGNMENT;

public class Q34_Type_Casting {
    public static void main(String[] args) {
//        Question 34: Type Casting Example 2
//
//    Create an int variable named intNumber and assign it the value 500.
//    Perform implicit casting by assigning intNumber to a long variable named longNumber.
//    Print both intNumber and longNumber.

        //implicit
        int intNumber=500;

        long longnumber=intNumber;

        System.out.println(longnumber);

          //explicit
        long Lnumber=500l;

        int intnumber=(int)Lnumber;

        System.out.println(intnumber);




    }
}
