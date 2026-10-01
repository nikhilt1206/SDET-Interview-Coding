package interviewcoding;

import java.util.LinkedHashSet;

public class UniqueWordExtraction {
    public static void main(String[] args){
        //Find all the unique words (words that appear only once in the final list, without duplicates).
        //Print the total count of those unique words.

        String input = "Bangalore is the IT capital of India, and Mumbai is the financial capital of India,";
        if(input==null || input.trim().isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }

        input = input.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = input.trim().split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(String s : words){
            set.add(s);
        }
        System.out.println("Unique Words: "+set);
        System.out.println("Total Unique words: "+set.size());
    }
}
