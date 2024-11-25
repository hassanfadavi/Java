package hassan.ASSIGNMENT;

public class Q26_Calculating_BMI {
    public static void main(String[] args) {

//        Question 26: Calculating BMI
//
//    Create a double variable named weight in kilograms and assign it the value 70.0.
//    Create a double variable named height in meters and assign it the value 1.75.
//    Calculate the BMI using the formula: BMI = weight / (height * height).
//    Print the BMI.

        double weightinkilograms=70.0;
        double heightinmeters=1.75;

        double BMI = (weightinkilograms /(heightinmeters * heightinmeters));

        System.out.println(BMI);
    }
}
