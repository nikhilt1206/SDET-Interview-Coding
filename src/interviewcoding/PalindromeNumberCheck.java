package interviewcoding;

public class PalindromeNumberCheck {
    public static void main(String[] args){
        int number = 121;
        int copyNum = number;
        int lastDigit;
        int reverseNum=0;
        while(number!=0){
            lastDigit=number%10;
            reverseNum=reverseNum*10+lastDigit;
            number=number/10;
        }
        if(reverseNum==copyNum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
