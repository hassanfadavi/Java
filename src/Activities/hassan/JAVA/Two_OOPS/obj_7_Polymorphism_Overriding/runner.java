package Activities.hassan.JAVA.Two_OOPS.obj_7_Polymorphism_Overriding;

public class runner {
    public static void main(String[] args) {


        var objBird=new Bird(
                "Black",
                "eagle"

        );
objBird.eat();



        var objHusky=new Huskey(
                "Black",
                "husky"

        );
        objHusky.eat();



    }
}
