package Activities.hassan.JAVA.ASSIGNMENT_JAVA.D_Array;

public class D7_Copying_Arrays {
    public static void main(String[] args) {
//7. Copying Arrays:
//Declare two arrays of integers,
// A = [5, 10, 15, 20, 25] and B of size 5.
// Now, copy all elements of array A into array B.

        int[] numA={5, 10, 15, 20, 25};
        int[] numB={50, 60, 70,80, 90};


         for(int i=0;i<=numA.length-1;i++){
             numA[i]=numB[i];
             System.out.println("numA: "+numA[i]+"  ," );

//             System.out.print("numb: "+numB[i]+"  , ");
         }







    }
}
