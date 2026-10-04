package interviewcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachCharacterInString {
    public static void main(String[] args){
        String input = "Banana";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> data : map.entrySet()){
            System.out.println(data.getKey()+"-"+data.getValue());
        }
    }
}
