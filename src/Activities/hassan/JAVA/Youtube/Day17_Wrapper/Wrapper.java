package Activities.hassan.JAVA.Youtube.Day17_Wrapper;

public class Wrapper {
    public static void main(String[] args) {


        String price1="10.5";
        String price2="20.5";



        //String ---->int
        String s1="10";

        int sint=Integer.parseInt(s1 );
        System.out.println(sint);



        //String ---->double
        String s3="10.5";
        String s4="11.6";

       Double sdou=Double.parseDouble(s3);
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));


        //String ---->boolean
        String s="false";

        System.out.println(Boolean.parseBoolean(s));

        //****************************************************************************************

        int a=10;

       String v=String.valueOf(a);
        System.out.println(v);





    }
}
