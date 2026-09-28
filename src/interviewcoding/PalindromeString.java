package interviewcoding;

public class PalindromeString {
    public static void main(String[] args){
        String input = "CIVIC";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length()-1;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end)){
                isPalindrome=false;
                break;
            }
            else{
                start++;
                end--;
                isPalindrome=true;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }
}
