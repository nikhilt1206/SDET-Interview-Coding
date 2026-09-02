package logicbuildingrevision;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesLettersFromString {
    public static void main(String[] args){
        String input = "Java";
        StringBuilder result = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for(char c : input.toCharArray()){
            if(set.add(c)){
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
