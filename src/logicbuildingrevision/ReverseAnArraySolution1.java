package logicbuildingrevision;

import java.util.Arrays;

public class ReverseAnArraySolution1 {
    public static void main(String[] args){
        int[] input = {10,20,30,40};
        int[] reverseInput = new int[input.length];
        int reverseIndex = 0;
        for(int index=input.length-1;index>=0;index--){
            reverseInput[reverseIndex] = input[index];
            reverseIndex++;
        }
        input = reverseInput; //reference changed
        System.out.println(Arrays.toString(input));
    }
}
