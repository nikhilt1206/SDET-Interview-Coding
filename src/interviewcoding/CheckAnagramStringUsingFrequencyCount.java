package interviewcoding;

import java.util.Arrays;

public class CheckAnagramStringUsingFrequencyCount {
    public static void main(String[] args){
        String s1 = "silent";
        String s2 = "listen";
        if(s1==null || s2==null || s1.isEmpty() || s2.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }
        s1=s1.toLowerCase().trim();
        s2=s2.toLowerCase().trim();
        if(s1.length()!=s2.length()){
            System.out.println("String are not anagram");
            return;
        }
    }
}
