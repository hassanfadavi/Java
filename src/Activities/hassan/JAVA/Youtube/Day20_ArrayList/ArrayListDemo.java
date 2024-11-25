package Activities.hassan.JAVA.Youtube.Day20_ArrayList;

import Activities.hassan.JAVA.Youtube.Day6and7_Arrays.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {



//              ArrayList myLis=new ArrayList();
//              List mylist=new ArrayList();



       //declare
//        ArrayList<Integer> myLis=new ArrayList<Integer>();


        //add
        ArrayList myLis=new ArrayList();
        myLis.add(10);
        myLis.add(20);
        myLis.add("welcome");


        //size
          myLis.size();
        System.out.println( myLis.size());
        //pint
        System.out.println(myLis);
        //remove
        myLis.remove(0);
        System.out.println(myLis);
        //insert
        myLis.add(1,50);
        System.out.println(myLis);
        //modify
        myLis.set(0,100);
        System.out.println(myLis);
        //retrieve
        myLis.get(0);
        System.out.println(myLis.get(0));

        //read data
        for(int i=0;i<=myLis.size()-1;i++){

          var l=myLis.get(i);
            System.out.print(l+",");
        }


        System.out.println();
        System.out.println("*********************");
        for(var lis:myLis  ){
            System.out.println(lis);
        }

        //check is empty
       boolean is=myLis.isEmpty();
        System.out.println(is);

        //remove all the elements

      ArrayList  myList2=new ArrayList();


        myList2.add(100);

       myLis.removeAll(myList2);
        System.out.println(myLis);












    }
}
