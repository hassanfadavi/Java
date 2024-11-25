package Activities.hassan.JAVA.One_JAVA;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ACTIVITY_55_LinkedHashMap_TreeMap {

    public static void main(String[] args) {


        Map<Integer,String> names=new LinkedHashMap<>();
        names.put(2,"David");
        names.put(1,"Jack");
        System.out.println(names);


        Map<Integer,String>name=new TreeMap<>();
        name.put(4,"David");
        name.put(3,"Jack");
        System.out.println(name);
    }
}
