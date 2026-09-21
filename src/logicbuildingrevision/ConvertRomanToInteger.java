package logicbuildingrevision;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertRomanToInteger {
    public static void main(String[] args){
        String input = "XII";
        //Symbol Right to Left increasing - perform addition
        //Symbol Right to Left decreasing - perform substraction
        //Hashmap to store Key(Symbol) and Value(Number)
        Map<Character,Integer> map = new LinkedHashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        int result = 0;
        int prevValue = 0;
        //Traverse string from reverse side
        for(int i=input.length()-1;i>=0;i--){
            char currentChar = input.charAt(i);
            int currentValue = map.get(currentChar);
            if(currentValue>=prevValue){
                result=result+currentValue;

            }
            else{
                result=result-currentValue;
            }
            prevValue=currentValue;
        }
        System.out.println(result);
    }
}
