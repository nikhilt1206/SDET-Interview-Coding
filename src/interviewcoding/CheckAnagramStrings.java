package interviewcoding;
import java.util.Arrays;

public class CheckAnagramStrings {
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
        char[] s1charArray = s1.toCharArray();
        char[] s2charArray = s2.toCharArray();
        Arrays.sort(s1charArray);
        Arrays.sort(s2charArray);
        if(Arrays.equals(s1charArray,s2charArray)){
            System.out.println("Strings are Anagram");
        }
        else{
            System.out.println("String are not anagram");
        }
    }
}
