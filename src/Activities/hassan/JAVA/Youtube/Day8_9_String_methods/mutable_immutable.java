package Activities.hassan.JAVA.Youtube.Day8_9_String_methods;

import java.util.Arrays;



public class mutable_immutable {
    public static void main(String[] args) {

        //mutable
        int a[]={20,10,40,50,30};

        Arrays.sort(a);    //modify   change the original values (mutable)

        System.out.println(Arrays.toString(a));

//********************************************************************************************

        //immutable
        String name="welcome";
         name.concat("to java");//modify   //immutable (can not change the original values )
        System.out.println(name);
        //change to mutable
        String conc=name.concat("to java"); //modify   mutable (change the original value)

        System.out.println(conc);

//********************************************************************************************

        //mutable
        StringBuffer sbf=new StringBuffer("welcome");
        sbf.append("to java");     //modify   mutable (change the original value)
        System.out.println(sbf);
//********************************************************************************************

        //mutable
        StringBuilder sbb=new StringBuilder("welcome");
        sbb.append("to java");     //modify   mutable (change the original value)
        System.out.println(sbb);
    }
}
