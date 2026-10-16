package interviewcoding;

public class ReverseWordsInStringInEvenPosition {
    public static void main(String[] args){
        String input = "I love Public Sapient";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=0;i< words.length;i++){
            if(i%2 != 0){
                StringBuilder sb = new StringBuilder(words[i]);
                result.append(sb.reverse()).append(" ");
            }
            else{
                result.append(words[i]).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
