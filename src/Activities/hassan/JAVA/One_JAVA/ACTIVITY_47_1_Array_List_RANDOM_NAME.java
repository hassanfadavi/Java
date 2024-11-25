package Activities.hassan.JAVA.One_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ACTIVITY_47_1_Array_List_RANDOM_NAME {
    public static void main(String[] args) {


        List<String>Name=new ArrayList<>();
        Random random=new Random();


        Name.add("Hassan");
        Name.add("Reihane");
        Name.add("Jack");
        Name.add("John");

//        System.out.println(Name);
//        System.out.println(Name.get(0));

        int randomIndex;


       randomIndex =random.nextInt(Name.size()-1)+0;

            System.out.println(randomIndex);

        System.out.println(Name.get(randomIndex));




    }
}
