package interviewcoding;

public class CheckAnagramStringUsingFrequencyCount {
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
        int[] freq = new int[26];
        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : s2.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i< freq.length;i++){
            if(freq[i]!=0){
                System.out.println("String are not anagram");
                return;
            }
        }
        System.out.println("String are anagram");
    }
}
