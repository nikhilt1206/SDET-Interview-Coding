package logicbuildingrevision;

import java.util.Arrays;

public class ReverseFirstWordOfString {
    public static void main(String[] args){
        String input = "Hello World From Java";
        //olleH World from Java
        reverseFirstWord(input);
    }

    private static void reverseFirstWord(String input) {
        if(input == null || input.isEmpty()){
            System.out.println("Cannot Reverse the String!!");
        }
        else{
            //split the array into 2 parts after encountering first space
            String[] words = input.split(" ",2);
            char[] charArray = words[0].toCharArray();
            int left=0;
            int right=charArray.length-1;
            while (left<right){
                char temp = charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }
            String reversedFirstWord = new String(charArray);
            System.out.println(reversedFirstWord +" "+ words[1]);
        }
    }
}
