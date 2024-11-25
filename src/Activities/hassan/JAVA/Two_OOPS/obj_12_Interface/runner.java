package Activities.hassan.JAVA.Two_OOPS.obj_12_Interface;

import java.util.ArrayList;
import java.util.List;

public class runner {
    public static void main(String[] args) {


        var objStudent1=new commanders(
                "hassan",
                "fadavi",
                "H",
                34,
                "Gaithersburg",
                "MD"
        );

        var objStudent2=new commanders(
                "reihane",
                "moosavi",
                "RM",
                24,
                "Gaithersburg",
                "MD"
        );


        objStudent1.printGeneralInfo();
        objStudent1.printClassInfo();

        //ArrayList
//
//        List<String>listOfStudent=new ArrayList<>();
//        listOfStudent.add(objStudent1.getFirstName());
//        listOfStudent.add(objStudent2.getFirstName());
//        System.out.println(listOfStudent);
//


        //or

        List<commanders>listofcommanders=new ArrayList<>();
        listofcommanders.add(objStudent1);
        listofcommanders.add(objStudent2);

        System.out.println(listofcommanders);

        for(commanders obj:listofcommanders){
            System.out.println(obj.getFirstName());
            System.out.println(obj.getLastName());
            System.out.println(obj.getMiddleName());
            System.out.println(obj.getAge());
            System.out.println(obj.getCity());
            System.out.println(obj.getState());

        }



    }
}
