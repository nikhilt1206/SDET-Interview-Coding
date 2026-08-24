package interviewcoding;

import java.util.Arrays;

public class ReverseWordsInAGivenString {
    public static void main(String[] args){

        String input = "I Love Java";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            char[] inputArray = word.toCharArray();
            int left=0;
            int right = word.length()-1;
            while(left<right){
                char temp = inputArray[left];
                inputArray[left]=inputArray[right];
                inputArray[right]=temp;
                left++;
                right--;
            }
            String reversedWord = new String(inputArray);
            sb.append(reversedWord+" ");
        }
        System.out.println(sb.toString().trim());
    }
}
