package Activities.hassan.JAVA.Two_OOPS.obj_9_2_static_import;

//import   Activities.hassan.ACTIVITIES_2.obj_9_2_static.test1.TestNeste.*;





//import  Activities.hassan.ACTIVITIES_2.obj_9_2_static.test1.*;




//import static Activities.hassan.ACTIVITIES_2.obj_9_2_static.test1.TestNeste.*;

import static Activities.hassan.JAVA.Two_OOPS.obj_9_2_static_import.test1.TestNeste.printMaxSpeed; //static
import static Activities.hassan.JAVA.Two_OOPS.obj_9_2_static_import.test1.TestNeste.printMinSpeed;   //static
//
import  Activities.hassan.JAVA.Two_OOPS.obj_9_2_static_import.test1.TestNeste;  // non-static

public class runner {
    public static void main(String[] args) {

        System.out.println(test1.firsName);//static



        printMaxSpeed();  //static
        printMinSpeed();   //static

        var obj1=new  TestNeste();
        obj1.printmessageee();   //non-static


        var obj2=new test1();   //non-static
        obj2.printmessage();






//
//         //or
//        TestNeste obj1=new  TestNeste();
//        System.out.println();//non-static
//        obj1.printMaxSpeed();
//        obj1.printminSpeed();
//        obj1.printmessage();





//        TestNeste obj1=new TestNeste();
//        obj1.printMaxSpeed();

//        obj1.printmessage();

//        TestNeste obj2=new TestNeste();
//        obj2.printminSpeed();







    }


}

