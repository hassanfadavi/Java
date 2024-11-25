package hassan.ASSIGNMENT;

public class Q35_Calculating_Compound_Interest {
    public static void main(String[] args) {

//        Question 35: //
//    Create a double variable named principalAmount and assign it the value 2000.0.
//    Create a double variable named annualRate and assign it the value 4.5.
//    Create an int variable named years and assign it the value 5.
//    Calculate the compound interest using the formula: Amount = principalAmount * Math.pow((1 + annualRate/100), years).
//    Print the amount.

        double principalAmount=2000.0;
        double annualRate=4.5;
        int years=5;

        float Amount =(float) (principalAmount * Math.pow((1 + annualRate/100), years));

        System.out.println(Amount);


    }
}
