package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_2_listManager;

import java.util.ArrayList;
import java.util.List;

public class test1_NameList {


    //Attributes

    public int a=10;

     private  List<String> listOfName;       // List<String>listOfName=new ArrayList<>();

    //Constructor
    public test1_NameList() {
        listOfName = new ArrayList<>();

    }





    public void addName(String newName) {
        listOfName.add(newName);
        System.out.println("name is added to list");

    }

    public void removeName(int index) {
        if (index >= 0 && index < listOfName.size()) {
            listOfName.remove(index);
            System.out.println(  "name has been removed");
        } else System.out.println("invalid index");

    }

    public void updateName(int index, String newName) {
        if (index >= 0 && index < listOfName.size()) {
            listOfName.set(index, newName);
            System.out.println("has been updated");
        } else System.out.println("invalid index");

    }

    //print
    public void printInfo(){
        for(int i=0;i<listOfName.size();i++){
            System.out.println(i+ " : "+listOfName.get(i));

        }
    }
}

