package interviewcoding;

public class ReverseStringTwoPointer {
    public static void main(String[] args){
        String input = "Java";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        int left=0;
        int right=input.length()-1;
        char[] charInput = input.toCharArray();
        while(left<right){
                char temp =charInput[left];
                charInput[left]=charInput[right];
                charInput[right]=temp;
                left++;
                right--;
        }
        System.out.println(charInput);
    }
}
