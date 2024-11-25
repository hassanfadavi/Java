package hassan.ASSIGNMENT;

public class Q39_alculating_Circle_Properties {
    public static void main(String[] args) {
//        Question 39: Calculating Circle Properties
//
//    Create a double variable named radius and assign it the value 7.5.
//    Calculate the area and circumference of the circle using the formulas:
//        Area = Math.PI * radius * radius
//        Circumference = 2 * Math.PI * radius
//    Print the area and circumference.



        double radius=7.5;

        float Area =(float) (Math.PI * radius * radius) ;
        float Circumference =(float) (2 * Math.PI * radius);

        System.out.println("area is : "+ Area+" \ncircumference is: "+ Circumference);
    }
}
