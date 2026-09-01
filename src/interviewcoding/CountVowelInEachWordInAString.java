    package interviewcoding;

    public class CountVowelInEachWordInAString {
        public static void main(String[] args){
            String input = "I am java programmer";
            if(input==null || input.isEmpty()){
                System.out.println("Invalid input!!");
                return;
            }
            String vowels = "aeiouAEIOU";
            String[] inputArray = input.split(" ");
            for(String word : inputArray){
                int count = 0;
                for(char c : word.toCharArray()){
                    if(vowels.indexOf(c)!=-1){
                        count++;
                    }
                }
                System.out.println(word+"->"+count);
            }
        }
    }
