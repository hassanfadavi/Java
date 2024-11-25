package Activities.hassan.JAVA.Two_OOPS.test.Multilevel;

public class runner {
    public static void main(String[] args) {

        var child=new child(
                "hassan"

        );


        var father=new father(
                "mohammad"
        );

        var greatfather=new Grandfather(
                "javad",
                "Bmw"
        );

        System.out.println(child.firstName);
        System.out.println(father.firstName);
        System.out.println(greatfather.firstName);
        System.out.println(greatfather.getCar());

    }
}
