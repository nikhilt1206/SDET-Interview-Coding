package interviewcoding;

public class StringManipulation3 {
    public static void main(String[] args){
        String input = "programming is fun";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }
        String vowels = "aeiouAEIOU";
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            char[] charArray = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(char c : charArray){
                if(vowels.indexOf(c)==-1){
                    sb.append(c);
                }
            }
            if(sb.length()>0){
                char firstChar = sb.charAt(0);
                char upperCase = Character.toUpperCase(firstChar);
                sb.setCharAt(0,upperCase);
                result.append(sb).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
