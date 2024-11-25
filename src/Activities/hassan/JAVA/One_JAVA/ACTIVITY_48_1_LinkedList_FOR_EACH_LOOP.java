package Activities.hassan.JAVA.One_JAVA;

import java.util.LinkedList;
import java.util.List;

public class ACTIVITY_48_1_LinkedList_FOR_EACH_LOOP {
    public static void main(String[] args) {


        List<String>names=new LinkedList<>();

        names.add("hassan");
        names.add("John");
        names.add("David");

//        System.out.println(names);
//
//        names.add(1,"Ali");
//        System.out.println(names);
//

        for(String name:names){
            if(name.equals("hassan")){
                System.out.println("is in the list");
                break;

            }else{
                System.out.println("is not in the list");
                break;
            }
        }


    }
}
