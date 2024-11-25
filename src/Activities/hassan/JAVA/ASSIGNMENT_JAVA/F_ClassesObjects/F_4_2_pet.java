package Activities.hassan.JAVA.ASSIGNMENT_JAVA.F_ClassesObjects;

public class F_4_2_pet {
    public static void main(String[] args) {

        var objPet1=new F_4_1_pet();
        objPet1.name="Buddy";
        objPet1.species="Dog";
        objPet1.age=5;


        var objPet2=new F_4_1_pet();
        objPet2.name="rubby";
        objPet2.species="cat";
        objPet2.age=2;



        var objownerPet=new F_4_3_petOwner();
        objownerPet.ownedPet=objPet1.name;
        objownerPet.address="adress";
        objownerPet.ownerName="hassan";


     //modify
        objPet2.age=3;

        //print
         objPet1.showPetDetails();
         objPet2.showPetDetails();
         objownerPet.Displayeowner();
    }
}
