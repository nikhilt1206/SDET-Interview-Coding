package interviewcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicatesInArray {
    public static void main(String[] args){
        int[] input = {12,45,32,45,67,21,12};
        if(input==null || input.length==0){
            System.out.println("Invalid Input!!");
            return;
        }
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num : input){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> data : map.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey());
            }
        }
    }
}
