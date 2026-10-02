package logicbuildingrevision;

public class ReverseOnlyLettersInString {
    public static void main(String[] args){
        String input = "1ab2";
        char[] charInput = input.toCharArray();
        int left=0;
        int right=charInput.length-1;
        while(left<right){
            if(!Character.isLetter(charInput[left])){
                left++;
            }
            else if(!Character.isLetter(charInput[right])){
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
        //System.out.println(charInput);
        System.out.println(new String(charInput)); //character array is passed in String object
        //This is create a new String
    }
}
