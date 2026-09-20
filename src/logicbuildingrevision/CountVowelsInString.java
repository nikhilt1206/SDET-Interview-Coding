package logicbuildingrevision;

public class CountVowelsInString {
    public static void main(String[] args){
        String input = "Hello World";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int index=0;index<=input.length()-1;index++){
            if(vowels.indexOf(input.charAt(index))!=-1){
                //indexOf(char) - tells the index of a particular character in the given string
                //if no char found then output will be -1 (indexOf())
                //charAt(index) - tells the character present at a particular index
                count++;
            }
        }
        System.out.println("Vowel Count : "+count);
    }
}
