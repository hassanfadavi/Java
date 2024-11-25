package Activities.hassan.JAVA.One_JAVA;

import java.util.*;

public class ACTIVITY_49_HashSet {
    public static void main(String[] args) {

        // generate 15 unique random numbers
        // print unique names



        String[] names = {"Bob", "Jack", "Bob", "Jack", "Tony", "Trevor", "Mike"};
        int[] numbers = {10, 10, 2, 3, 4, 1, 0, 1, 3, 2, 7, 8, 55, 10, 190, 180, 200};
        Set<String > uniqueNames=new HashSet<>();
        Set<Integer>uniqueNumbers=new HashSet<>();





         //unique values

        for(String name:names)
            uniqueNames.add(name);
        System.out.println(uniqueNames);


            for(int number:numbers)
            uniqueNumbers.add(number);
            System.out.println(uniqueNumbers);


            String duplicate;



        //duplicate values

        Set<String > duplicateNames=new HashSet<>();

        for(String name:names){
            if(!(duplicateNames.add(name))){
                System.out.println(name);





                //example

                Set<String > employee=new HashSet <>();


                employee.add("Eric");
                employee.add("Jack");
                employee.add("Hassan");
                employee.add("Hassan");
                employee.add(null);

                System.out.println(employee);


                //example

                String oldValue="Eric";
                String newValue="Killy";
                for(String employe:employee);
                if(employee.contains(oldValue)){
                    employee.remove(oldValue);
                }

                employee.add(newValue);
                System.out.println(employee);

            }
               
            }
























    }
}
