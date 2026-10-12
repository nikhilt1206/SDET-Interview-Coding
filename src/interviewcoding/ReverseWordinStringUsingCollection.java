package interviewcoding;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordinStringUsingCollection {
    public static void main(String[] args){
        String input = "Java is fun";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        input=input.trim();
        String[] inputArray = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : inputArray){
            char[] charArray = word.toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            for(char c : charArray){
                list.add(c);
            }
            Collections.reverse(list);
            for(char c : list){
                sb.append(c);
            }
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
