package Activities.hassan.JAVA.Two_OOPS.obj_9_2_static_import;



public class test1 {

    //Attribute
    static String firsName;
    static  int maxSpeed = 100;
    static   int minSpeed = 120;


    static class TestNeste {

        //Attributes
        static int salary = 120000;

        //print
        public static void printMaxSpeed() {
            System.out.println(maxSpeed);

        }

        //
        public static void printMinSpeed() {
            System.out.println(minSpeed);
        }

        public void printmessageee() {

            System.out.println("hiiii");
        }


    }


    public void printmessage() {
        System.out.println("hii");
    }
}
