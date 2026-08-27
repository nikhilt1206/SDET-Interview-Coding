package interviewcoding;

public class FindVowelsAndConsonantsInString {
    public static void main(String[] args){
        String input = "Automation@1234";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!");
            return;
        }
        int vowelCount=0;
        int consonantCount=0;
        String vowels = "aeiouAEIOU";
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                if(vowels.indexOf(c)!=-1){
                    vowelCount++;
                }
                else{
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowels: "+vowelCount);
        System.out.println("Consonants: "+consonantCount);
    }
}
