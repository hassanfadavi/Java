package hassan.ASSIGNMENT;

public class Q21_Simple_Interest_Calculation {
    public static void main(String[] args) {

//        Question 21: Simple Interest Calculation
//
//    Create a double variable named principal and assign it the value 1000.0.
//    Create a double variable named rate and assign it the value 5.5.
//    Create an int variable named time and assign it the value 2.
//    Calculate the simple interest using the formula: SimpleInterest = (principal * rate * time) / 100.
//    Print the simple interest.


        double principal=1000.0;
        double rate=5.5;
        int time=2;
      double  SimpleInterest = (principal * rate * time) / 100;
        System.out.println(SimpleInterest);

        int  SimpleInterest2 =(int) (principal * rate * time) / 100;
        System.out.println(SimpleInterest2);

    }
}
