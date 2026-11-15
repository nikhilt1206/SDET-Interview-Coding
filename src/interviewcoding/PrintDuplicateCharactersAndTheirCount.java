package interviewcoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintDuplicateCharactersAndTheirCount {
    public static void main(String[] args){
        String input ="hcl-tech";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        for(Map.Entry<Character,Integer> data : map.entrySet()){
            if(data.getValue()>1){
                System.out.println(data.getKey()+"->"+data.getValue());
            }
        }
    }
}
