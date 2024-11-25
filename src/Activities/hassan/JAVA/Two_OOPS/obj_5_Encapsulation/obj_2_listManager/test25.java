package Activities.hassan.JAVA.Two_OOPS.obj_5_Encapsulation.obj_2_listManager;

public class test25 {
    //Animal
    //Attributes

    private String name;
    private int age;


    //constructor
    public test25(String name,int age){
      setName(name);
      setAge(age);
    }




    //Getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }


    //print
    public void eat(){
        System.out.println(getName()+" eating");
    }

    public void sleep(){
        System.out.println(getName()+ " sleeping");
    }



}
