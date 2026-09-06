package interviewcoding;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args){
        int[] input = {1,3,0,4,5,0,2,0};
        if(input == null || input.length == 0){
            System.out.println("Invalid input!!");
            return;
        }
        int nonZeroIndex=0;
        for(int i=0;i<input.length;i++){
            if(input[i]!=0){
                input[nonZeroIndex]=input[i];
                nonZeroIndex++;
            }
        }
        for(int i = nonZeroIndex;i<input.length;i++){
            input[i]=0;
        }
        System.out.println(Arrays.toString(input));
    }
}
