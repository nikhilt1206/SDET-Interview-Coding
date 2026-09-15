package interviewcoding;

public class FindCountOfSpecialCharsNumsCapitalSmallLettersInString {
    public static void  main(String[] args){
        String input = "Hello@123World#";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        int capitalLetterCount=0;
        int smallLetterCount=0;
        int specialCharCount=0;
        int numberCount=0;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                numberCount++;
            }
            else if(Character.isLetter(c)){
                if(Character.isLowerCase(c)){
                    smallLetterCount++;
                }
                else if(Character.isUpperCase(c)){
                    capitalLetterCount++;
                }
            }
            else{
                specialCharCount++;
            }
        }
        System.out.println("Capital Letters : "+capitalLetterCount);
        System.out.println("Small Letters : "+smallLetterCount);
        System.out.println("Numbers : "+numberCount);
        System.out.println("Special Character : "+specialCharCount);
    }
}
