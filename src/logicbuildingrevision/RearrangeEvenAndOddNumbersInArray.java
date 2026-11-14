package logicbuildingrevision;

import java.util.Arrays;

public class RearrangeEvenAndOddNumbersInArray {
    public static void main(String[] args){
        int[] input = {1,0,2,0,4,3,5};
        int left=0;
        int right=input.length-1;
        int evenEnd=0;
        while(left<right){
           while((left<right) && (input[left]%2==0)){
               left++;
           }
           while((left<right) && (input[right]%2!=0)){
                right--;
           }
           if(left<right){
               int temp = input[left];
               input[left]=input[right];
               input[right]=temp;
               left++;
               right--;
           }
        }
        while(evenEnd<input.length && input[evenEnd]%2==0){
            evenEnd++;
        }
        Arrays.sort(input,0,evenEnd);
        Arrays.sort(input, evenEnd  , input.length);
        System.out.println(Arrays.toString(input));
    }
}
