package logicbuildingrevision;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFrequencyOfSpecialCharactersInString {
    public static void main(String[] args){
        //Ignore numbers, alphabets and whitespaces
        String input = "abs#@#!";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : input.toCharArray()){
            if(!(c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') || (c==' ')){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        System.out.println(map);
    }
}
