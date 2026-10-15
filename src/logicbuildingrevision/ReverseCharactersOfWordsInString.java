package logicbuildingrevision;

import java.util.Arrays;

public class ReverseCharactersOfWordsInString {
    public static void main(String[] args){
        String input = "This is fun";
        String[] words = input.split("\\s+");
        String result = "";
        for(String word : words){
            char[] charArray = word.toCharArray();
            int left = 0;
            int right = charArray.length-1;
            while(left<right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            result = result + new String(charArray)+" ";
        }
        System.out.println(result.trim());
    }
}
