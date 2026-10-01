package logicbuildingrevision;

public class ReverseOnlyVowelsOfaString {
    public static void main(String[] args){
        //only vowels in the string should be reversed
        String input = "Hello";
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = input.length()-1;
        char[] charInput = input.toCharArray();
        while(left<right){
            if(vowels.indexOf(charInput[left])==-1){
                left++;
            }
            else if(vowels.indexOf(charInput[right])==-1){
                right--;
            }
            else{
                char temp = charInput[left];
                charInput[left]=charInput[right];
                charInput[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(charInput);
    }
}
