package interviewcoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseStringAndFindFrequencyOfCharacters {
    public static void main(String[] args){
        String input = "Hello";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        int left=0;
        int right=input.length()-1;
        char[] charInput = input.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        while(left<right){
            char temp = charInput[left];
            charInput[left]=charInput[right];
            charInput[right]=temp;
            left++;
            right--;
        }
        for(char c : input.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.print("Reversed String: ");
        System.out.println(charInput);
        for(Map.Entry<Character,Integer> data : map.entrySet()){
            System.out.println(data.getKey()+"->"+data.getValue());
        }
    }
}
