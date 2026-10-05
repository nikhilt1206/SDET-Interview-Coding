package interviewcoding;

public class CountWordsInString {
    public static void main(String[] args){
        String input = "my name      is umesh";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        input = input.trim();
        String[] words = input.split("\\s+");
        int count = 0;
        for(String word : words){
            count++;
        }
        System.out.println(count);
    }
}
