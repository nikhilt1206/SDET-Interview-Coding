package logicbuildingrevision;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWordsInString {
    public static void main(String[] args){
        String input = "Hi my name is Nikhil Nikhil";
        Map<String,Integer> map = new LinkedHashMap<>();
        String[] words = input.split("\\s+");
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> data : map.entrySet()){
            System.out.println(data.getKey()+"->"+data.getValue());
        }
    }
}
