package Activities.hassan.JAVA.One_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ACTIVITY_47_2_Array_List_RANDOM_number {
    public static void main(String[] args) {

//
//        Random random=new Random();
//        List<Integer>LIstOfRandomNumber=new ArrayList<>();
//        int randomNumber;
//
//        for(int i=1;i<=5;i++){
//
//            randomNumber=random.nextInt(100)+1;
//
//            LIstOfRandomNumber.add(randomNumber);
//        }
//        System.out.print(LIstOfRandomNumber);

        //ex:





        List<Integer>listOfrandomNumbers=new ArrayList<>();

        Random random=new Random();

        for(int i=0;i<=15;i++){

            listOfrandomNumbers.add(random.nextInt(10)+1);

        }
        System.out.println(listOfrandomNumbers);


















    }
}
