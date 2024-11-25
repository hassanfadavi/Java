package Activities.hassan.JAVA.ASSIGNMENT_JAVA.G_OOP_Concepts1_Ecapsulation;

public class G_3_2_LoginSystem {

    //Attribute
    private String hashedPassword;

    //constructor
    public G_3_2_LoginSystem(String hashedPassword){
        setHashedPassword(hashedPassword);
    }

    //getter
    public String getHashedPassword(){
        return this.hashedPassword;
    }

    //setter
    public void setHashedPassword(String hashedPassword){

        this.hashedPassword=hashedPassword;
    }




}
