package logicbuildingrevision;

public class PalindromeNumberUsingStringBuilder {
    public static void main(String[] args){
        int number = 121;
        //Convert number to string
        String originalNumberInString = Integer.toString(number);
        //Integer - Non-Primitive Wrapper Class - wraps primitive DT into the NPDT
        //Another method to convert integer to string
        String originalNumberInString2 = number + "";
        //If we add any primitive value to a string - it will become a string
        //To reverse the string - we have special class - StringBuilder
        StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
        //toString() will convert StringBuilder to String
        String reveresedString = reverseStringBuilder.reverse().toString();
        //Compare 2 Strings
        if(originalNumberInString.equals(reveresedString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
