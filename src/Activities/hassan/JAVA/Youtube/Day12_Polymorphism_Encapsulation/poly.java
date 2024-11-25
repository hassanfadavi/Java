package Activities.hassan.JAVA.Youtube.Day12_Polymorphism_Encapsulation;

public class poly {



//    void add(int a,int b ){
//        System.out.println(a+b);
//    }
//    void add(int a,int b,int c ){
//        System.out.println(a+b+c);
//    }
//    void add(int a,int b,int c,int d ){
//        System.out.println(a+b+c+d);
//    }











    //Attribute
     double width;
    double height;
    double depth;

//constructor


    poly(){
        width=20;
        height=20;
        depth=20;
    }


    //constructor
    poly(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }

    //print method
    double volume(){
        return width*height*depth;
    }








}
