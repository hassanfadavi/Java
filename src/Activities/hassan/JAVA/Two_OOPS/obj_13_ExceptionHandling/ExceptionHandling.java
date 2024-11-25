package Activities.hassan.JAVA.Two_OOPS.obj_13_ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int numberOne=10;
            int numberTwo=0;
            System.out.println(  (numberOne / numberTwo));

        } catch (
                ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }

        System.out.println("Java is getting interesting!");



       //another

        try {
            String[] names = {"Bob", "Alex", "James"};

            System.out.println(names[3]);//crsh


        } catch (ArrayIndexOutOfBoundsException ao) {
            ao.printStackTrace();
        }
        System.out.println("welcome ");




        //multiple exception

        try {
            String[] name = {"Bob", "Alex", "James"};

            System.out.println(name[3]);//crsh

            System.out.println(10 / 0); //crash

        } catch (Exception f) {
            f.printStackTrace();
        }
        System.out.println("welcome ");






    }
}