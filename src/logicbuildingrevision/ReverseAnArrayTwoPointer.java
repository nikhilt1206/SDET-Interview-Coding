package logicbuildingrevision;

import java.util.Arrays;

public class ReverseAnArrayTwoPointer {
    public static void main(String[] args){
        int[] input = {10,20,30,40,50};
        //Two pointer approach - no extra array needed, in-place modification
        int left = 0;
        int right = input.length-1;
        int temp;
        while(left<right){
            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(input));
    }
}
