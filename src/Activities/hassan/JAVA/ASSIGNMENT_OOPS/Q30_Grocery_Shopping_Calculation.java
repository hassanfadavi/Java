package hassan.ASSIGNMENT;

public class Q30_Grocery_Shopping_Calculation {
    public static void main(String[] args) {

//        Question 30: Grocery Shopping Calculation
//
//    Create int variables named apples and bananas to store the quantities of apples and bananas bought, assigning them values like 3 and 6.
//    Create double variables named pricePerApple and pricePerBanana and assign them values like 0.50 and 0.30.
//    Calculate the total cost for the apples and bananas.
//    Print the total cost.

        int apples=3;
        int banana=6;

        double pricePerApple=0.5;
        double pricePerBanana=0.3;



        double totalcostapple=apples*pricePerApple;
         float totalcostbanana=(float) (banana*pricePerBanana);

        System.out.println(totalcostapple);
        System.out.println(totalcostbanana);

    }
}
