package Activities.hassan.JAVA.One_JAVA;



import java.util.Scanner;

public class ACTIVITY_1 {
//
    public static void main(String[] args) {


    /*
     * Write a java program to store some properties of a car and print the full details in the console.
     * */






        //1at way  (store the information directly into the variables in which you're going to create)
//
//String Car_Model="BMW";
//int Car_year=2024;
//double Car_price=20000.59;
//
//
//  System.out.println("car_Model: " +Car_Model + "   car_year: "+Car_year + "   Car_price "+Car_price);

        //2nd way  (ask the user to enter the full details during the execution of your program.)

        Scanner Car_input=new Scanner(System.in);

         String Car_Model,Car_Make;
         int Car_year;
         double Car_price;

        System.out.print("please enter your car model:");
        Car_Model=Car_input.next();


        System.out.print("please enter your car year:");
        Car_year=Car_input.nextInt();

        System.out.print("please enter your car price:");
        Car_price=Car_input.nextDouble();

        System.out.print("please enter your car make:");
        Car_Make=Car_input.next();


        System.out.println("********car information*********");
        System.out.println("Car price " + Car_price);
        System.out.println("Car model " + Car_Model);
        System.out.println("Car year " + Car_Make);
        System.out.println("Car make " + Car_year);

        //or

        System.out.println("********car information*********");
        System.out.println("Car price " + Car_price+" \n "+
                "car model"+Car_Model+ " \n"+
                "Car year"+Car_year+ "\n"+
                "car make" + Car_Make + "\n"
        );










}

}