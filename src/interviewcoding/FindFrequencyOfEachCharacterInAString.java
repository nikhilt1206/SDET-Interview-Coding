package interviewcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfEachCharacterInAString {
    public static void main(String[] args){
        String input = "catalog";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> data : map.entrySet()){
            System.out.println(data.getKey()+"->"+data.getValue());
        }
    }
}
