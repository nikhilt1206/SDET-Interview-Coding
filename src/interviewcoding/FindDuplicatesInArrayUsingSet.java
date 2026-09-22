package interviewcoding;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesInArrayUsingSet {
    public static void main(String[] args){
        int[] input = {12,45,32,45,67,21,12};
        if(input==null || input.length==0){
            System.out.println("Invalid Input!!");
            return;
        }
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : input){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}
