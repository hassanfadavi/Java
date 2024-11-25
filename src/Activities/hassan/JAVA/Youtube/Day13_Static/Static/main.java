package Activities.hassan.JAVA.Youtube.Day13_Static.Static;

public class main {
    public static void main(String[] args) {


        //access to static
        Student.a=10;
        Student.m1();





        //access to non-static
       Student st=new Student();
       st.b=20;
       st.m2();
       st.m3();


       int l=Student.s.length();
        System.out.println(l);


    }
}
