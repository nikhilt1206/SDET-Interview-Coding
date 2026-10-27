package interviewcoding;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        if(a == null || a.length == 0){
            System.out.println("Invalid input!!");
            return;
        }
        int[] result = new int[a.length];
        for(int i=0;i<a.length;i++){
            int product = 1;
            for(int j=0;j<a.length;j++){
                if (j == i) {
                    continue;
                }
                product = product * a[j];
            }
            result[i]=product;
        }
        System.out.println(Arrays.toString(result));
    }
}
