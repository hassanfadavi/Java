package Activities.hassan.JAVA.ASSIGNMENT_JAVA.G_OOP_Concepts1_Ecapsulation;

public class G_1_2_main {
    public static void main(String[] args) {

        var objBank=new G_1_1_BankAccount(
                5000,
                "123544"
        );


       objBank.deposit(1000);
       objBank.withdraw(7000);
       objBank.balance();







    }
}
