package interviewcoding;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInAString {
    public static void main(String[] args){
        String input = "Programming";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char c : input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> data : map.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey());
            }
        }
    }
}
