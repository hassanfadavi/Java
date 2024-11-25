package Activities.hassan.JAVA.ASSIGNMENT_JAVA.F_ClassesObjects;

public class F_1_2_laptop {

        public static void main(String[] args) {




            var objLaptop1=new F_1_1_laptop();

            objLaptop1.brand="Dell";
            objLaptop1.model="Inspiron";
            objLaptop1.price=800;





            var objLaptop2=new F_1_1_laptop();
            objLaptop2.brand="ASUS";
            objLaptop2.model="Zenbook";
            objLaptop2.price=1500;


if(objLaptop1.price>500){
   double discount= objLaptop1.price*(0.9);
    System.out.println("update price: "+discount);
    objLaptop1.displayDetails();
            }

 if(objLaptop2.price>500){
       double discount= objLaptop2.price*(0.9);
       System.out.println("update price: "+discount);
     objLaptop2.displayDetails();
            }









        }




    }
