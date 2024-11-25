package Activities.hassan.JAVA.One_JAVA;

import java.util.*;

public class ACTIVITY_46_1_Array_List {
    public static void main(String[] args) {


        List<Integer> number=new ArrayList<>();




        number.add(10);
        number.add(20);
        number.add(20);

        System.out.println(number);

        number.add(1,15);

        System.out.println(number);


        number.set(0,500);
        System.out.println(number);




        List<Integer>ID=new ArrayList<>();

        ID.add(100);
        ID.add(200);
        ID.add(300);


        System.out.println(ID);

        number.addAll(ID);
        System.out.println(number);


//for each loop
        for(int element:number){
            System.out.print(element+", ");
        }


//for loop

//        System.out.println(number.get(2));


        for(int i=0;i<number.size();i++){
            System.out.print(number.get(i));
        }




        List<String >Names=new ArrayList<>();

        for(int i=0;i<=5;i++){
            Names.add("Hassan") ;



        }

        System.out.println(Names);







    }
}

