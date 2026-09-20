package interviewcoding;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindUniqueElementsFromString {
    public static void main(String[] args){
        String input = "aaaaacccccddeebb";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }
        Set<Character> set = new LinkedHashSet<>();
        for(char c : input.toCharArray()){
            if(set.add(c)){
                System.out.println(c);
            }
        }
    }
}
