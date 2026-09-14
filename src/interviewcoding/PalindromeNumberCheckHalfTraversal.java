package interviewcoding;

public class PalindromeNumberCheckHalfTraversal {
    public static void main(String[] args){
        int number = 12321;
        if(number<0 || (number%10==0 && number!=0)){
            System.out.println("Not a Palindrome Number");
            return;
        }
        int reverseHalf=0;
        int lastDigit;
        while(number>reverseHalf){
            lastDigit=number%10;
            reverseHalf=reverseHalf*10+lastDigit;
            number=number/10;
        }
        if(number==reverseHalf || number==reverseHalf/10){
            System.out.println("Palindorme Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
