package interviewcoding;

import java.util.Arrays;

public class SortCharacterArrayHavingDuplicatesWithoutUsingCollections {
    public static void main(String[] args){
        char[] input = {'a', 'd', 'b', 'a', 'c', 'd', 'b'};
        if(input==null || input.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        int largestIndex=0;
        for(int i=0;i<input.length;i++){
            largestIndex = i;
            for(int j=i+1;j<input.length;j++){
                if(input[j]>input[largestIndex]){
                    largestIndex=j;
                }
            }
            char temp = input[largestIndex];
            input[largestIndex]=input[i];
            input[i]=temp;
        }
        System.out.println(Arrays.toString(input));
    }
}
