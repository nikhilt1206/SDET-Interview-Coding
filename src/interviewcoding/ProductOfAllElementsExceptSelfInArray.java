package interviewcoding;

import java.util.Arrays;

public class ProductOfAllElementsExceptSelfInArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4};
        int product=1;
        for(int num : array){
            product*=num;
        }
        int[] result = new int[array.length];
        for(int i=0;i< array.length;i++){
            result[i]=product/array[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
