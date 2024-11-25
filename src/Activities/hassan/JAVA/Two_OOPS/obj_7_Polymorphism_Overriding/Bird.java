package Activities.hassan.JAVA.Two_OOPS.obj_7_Polymorphism_Overriding;

public class Bird extends Animal{

    //Attributes
public String color;

    //constructor
    public  Bird(String color,String name ){
        super(color,name);

    }

@Override
    public   void eat(){
        System.out.println("Bird is eating");

    System.out.println(super.color);
    super.eat();

    }


}
