package interviewcoding;

public class FindDuplicatesInStringLowerCaseOnly {
    public static void main(String[] args){
        String input = "programming";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        findDuplicates(input);
    }

    private static void findDuplicates(String input) {
        int[] freq = new int[26]; //frequency for lowercase English letters

        //Count frequency
        for(char c : input.toCharArray()){
            freq[c-'a']++;
        }

        //Print duplicates
        for(char c : input.toCharArray()){
            if(freq[c-'a']>1){
                System.out.println(c + "->" + freq[c-'a']);
                freq[c-'a']=-1;
            }
        }
    }
}
