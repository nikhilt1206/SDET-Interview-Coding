package interviewcoding;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum = sum + nums[j];
            }
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));
    }
}
