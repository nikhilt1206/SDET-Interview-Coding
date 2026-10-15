package interviewcoding;

import java.util.HashMap;
import java.util.Locale;

public class CheckAnagramStringUsingHashMap {
    public static void main(String[] args){
        String s1 = "silent";
        String s2 = "listen";
        if(s1==null || s2==null){
            System.out.println("Invalid Input!!");
            return;
        }
        s1=s1.toLowerCase().trim();
        s2=s2.toLowerCase().trim();
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Invalid Input!!");
            return;
        }
        if(s1.length()!=s2.length()){
            System.out.println("String are not anagram");
            return;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : s2.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.getOrDefault(c,0)-1);
           }
           else{
               System.out.println("String are not anagram");
               return;
           }
        }
        for(int value : map.values()){
            if(value!=0){
                System.out.println("String are not anagram");
                return;
            }
        }
        System.out.println("String are anagram");
    }
}
