package interviewcoding;

public class FindDuplicatesCharactersInStringOptimizedO1Space {
    public static void main(String[] args){
        String input = "Programming";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        findDuplicates(input);
    }

    private static void findDuplicates(String input) {
        int[] freq = new int[256]; //covers all ASCII characters

        //Count frequency
        for(char c : input.toCharArray()){
            freq[c]++;
        }

        //Print duplicates
        for(char c : input.toCharArray()){
            if(freq[c]>1){
                System.out.println(c + "->" + freq[c]);
                freq[c]=-1;
            }
        }
    }
}
