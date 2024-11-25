package hassan.ASSIGNMENT;

public class Q36_Temperature_Conversion {
    public static void main(String[] args) {

//        Question 36: Temperature Conversion (Fahrenheit to Celsius)
//
//    Create a double variable named fahrenheit and assign it the value 98.6.
//    Convert the temperature to Celsius using the formula: Celsius = (fahrenheit - 32) * 5/9.
//    Print the temperature in Celsius.

        double fahrenheit=98.6;

        float Celsius =(float) ((fahrenheit - 32) * 5/9);
        System.out.println(Celsius+" Celsius");

    }
}
