package interviewcoding;

import java.util.Arrays;

public class ProductOfAllElementsExceptSelfInArrayZeroCase {
    public static void main(String[] args){
        int[] array = {1,2,0,4};
        int zeroCount=0;
        int product=1;
        for(int num : array){
            if(num==0){
                zeroCount++;
            }
            else{
                product*=num;
            }
        }
        int[] result = new int[array.length];
        for(int i=0;i<array.length;i++){
           if(zeroCount>1){
               result[i]=0;
           }
           else if(zeroCount==1){
               if(array[i]==0){
                   result[i]=product;
               }
               else{
                   result[i]=0;
               }
           }
           else{
               result[i]=product/array[i];
           }
        }
        System.out.println(Arrays.toString(result));
    }
}
