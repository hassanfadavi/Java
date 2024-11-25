package Activities.hassan.JAVA.ASSIGNMENT_JAVA.F_ClassesObjects;

public class F_5_3_MobilePhone {
    public static void main(String[] args) {

        var mobile1=new F_5_2_MobilePhone();

        mobile1.brand="Samsung";
        mobile1.model="Galaxy S21";
        mobile1.storageCapacity=128 ;

        var mobile2=new F_5_2_MobilePhone();
        mobile2.brand="iphone";
        mobile2.model="iphine12";
        mobile2.storageCapacity=512 ;

        var phoneOwne=new F_5_3_Phone_Owner();
        phoneOwne.userName="hassan";
        phoneOwne.userNumber=240408556;
        phoneOwne.userPhone=mobile1.model;

        //modify
        mobile1.storageCapacity=256;

        //print
        mobile1.displaySpecifications();
        mobile2.displaySpecifications();
        mobile2.displaySpecifications();





    }
}
