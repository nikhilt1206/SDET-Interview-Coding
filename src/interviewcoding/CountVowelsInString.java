package interviewcoding;

public class CountVowelsInString {
    public static void main(String[] args){
        String input = "I am java programmer";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        int count = 0;
        String vowels = "aeiou";
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
            char currentChar = input.charAt(i);
            if(vowels.indexOf(currentChar)!=-1){
                count++;
            }
        }
        System.out.println("Count of vowels in string: "+count);
    }
}
