package interviewcoding;

import java.util.Arrays;

public class ArrayModification {
    public static void main(String[] args){
        int[] input = {1, 3, 4, 5, 3, 2};
        int targetSum=6;
        if(input == null || input.length == 0){
            System.out.println("Invalid input!!");
            return;
        }
        int partner;
        int[] result = new int[input.length];
        int nextIndex=0;
        for(int i=0;i<input.length;i++){
            partner = targetSum - input[i];
            for(int j=i+1;j<input.length;j++){
                if(input[j]==partner){
                    result[nextIndex]=input[i];
                    result[nextIndex+1]=input[j];
                    nextIndex=nextIndex+2;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
