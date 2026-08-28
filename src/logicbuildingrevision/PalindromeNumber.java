package logicbuildingrevision;

public class PalindromeNumber {
    public static void main(String[] args){
        int number = 151;
        int reverseNum = 0;
        int lastDigit;
        int originalNum = number;

        while(number != 0){
            lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number = number / 10;
        }
        if(reverseNum == originalNum){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
