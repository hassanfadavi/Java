package Activities.hassan.JAVA.Youtube.Day15_Overriding.Day15_final;

public class Dog extends Animal {


   String color="black";


    void printColor(){
        System.out.println(color);
       System.out.println(super.color);
    }


    void eat(){
        System.out.println("dog is eating");
        super.eat();
    }





}
