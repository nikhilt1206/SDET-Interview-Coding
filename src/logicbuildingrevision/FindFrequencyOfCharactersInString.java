package logicbuildingrevision;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfCharactersInString {
    public static void main(String[] args){
        String input = "madam";

        //Tell how many times each character has appeared
        //Map is an associative array (no duplicate keys)
        //O(1) - Search/Insert
        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> data : frequencyMap.entrySet()){
            System.out.println(data.getKey()+"->"+data.getValue());
        }
    }
}
