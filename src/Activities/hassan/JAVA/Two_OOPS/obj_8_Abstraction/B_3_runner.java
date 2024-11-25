package Activities.hassan.JAVA.Two_OOPS.obj_8_Abstraction;

public class B_3_runner {
    public static void main(String[] args) {

        var objCar=new B_2_CAR(
                "BMW",
                "Z4",
                2024,
                "white",
                4
        );


        objCar.printProperties();
        objCar.stop();
        objCar.start();
        objCar.honk();
        objCar.door();





    }
}
