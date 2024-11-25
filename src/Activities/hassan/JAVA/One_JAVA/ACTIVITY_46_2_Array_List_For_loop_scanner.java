package Activities.hassan.JAVA.One_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ACTIVITY_46_2_Array_List_For_loop_scanner {
    public static void main(String[] args) {




//
//        List<String> names =new ArrayList<>();
//        var input=new Scanner(System.in);
//        List<String> company =new ArrayList<>();
//
//
//        for(int i=0;i<3;i++){
//            System.out.print("your company: ");
//            company.add(input.next());
//        }
//
//
//        //ex
//
//        for(int i=0;i<3;i++){
//            System.out.print("your names: ");
//            names.add(input.next());
//        }
//        names.addAll(company);
//
//
//        System.out.println(names);



        List<Integer>numbers=new ArrayList<>();

        var inputnums=new Scanner(System.in);

        for(int i=0;i<=5;i++){

            System.out.println("enter the number "+( i+1 ) +": ");
             numbers.add(inputnums.nextInt());

        }

        System.out.println(numbers);










    }
}
