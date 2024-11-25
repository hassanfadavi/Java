package Activities.hassan.JAVA.ASSIGNMENT_JAVA.One_Variables;

public class price_calculation {
    public static void main(String[] args) {
//        3. Price Calculation:
//You went to a store where apples cost 0.50 each,
// and oranges cost 0.75 each. Define variables applesBought and
// orangesBought and assign values 6 and 4 to them respectively.
// Now, calculate the total cost and store it in a variable called totalCost.


        double[]cost=new double[2];
        cost [0]=0.5; //apple
        cost [1]=0.75; //orange

        int[]bought=new int[2];
        bought[0]=6;//applesBought
        bought[1]=4;//orangesBought

        double totalcost=cost[0]*bought[0]+cost[1]+bought[1];

        System.out.println("$"+totalcost);








    }
}
