package Activities.hassan.JAVA.Two_OOPS.obj_9_final;

public class final_Keyword {


    static final int salary=100001;  //class level final variable
    final boolean isTrue=true;  //instance level final variable

    public static void main(String[] args) {

        final String lastName;  //local final variable
        lastName="Doe"; //first time is ok
//        lastName="morphy";     //can't be changed

        String firtName="hassan";
        System.out.println(firtName);
        firtName="tony";
        System.out.println(firtName);

    }





}
