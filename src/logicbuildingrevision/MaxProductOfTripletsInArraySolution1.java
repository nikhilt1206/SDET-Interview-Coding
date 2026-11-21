package logicbuildingrevision;

import java.util.Arrays;

public class MaxProductOfTripletsInArraySolution1 {
    public static void main(String[] args){
        //Maximum product of triplets (3 numbers) in an array
        int[] a = {-10,-3,5,6,-20};
        int n = a.length;
        if(n<3){
            System.err.println("Minimum number of elements should be 3");
            System.exit(0);
        }
        //Step 1 - sort the array
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //Calculate result - 2 cases
        //Case 1 : Assume all elements are positive
        int result1 = a[n-1]*a[n-2]*a[n-3];
        //Case 2 : Assume elements at 0th and 1st index and the last index
        int result2 = a[0]*a[1]*a[n-1];
        int result = Math.max(result1,result2);
        System.out.println(result);
    }
}
